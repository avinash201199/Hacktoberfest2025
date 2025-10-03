import java.util.*;

public class BallDistributionProbability {
    private int halfTotalBalls;
    private long[][] binomialCoefficients;
    private int[] balls;
    private Map<List<Integer>, Long> memoization = new HashMap<>();

    public double getProbability(int[] balls) {
        int totalBalls = 0;
        int maxBallsPerColor = 0;
        for (int ballCount : balls) {
            totalBalls += ballCount;
            maxBallsPerColor = Math.max(maxBallsPerColor, ballCount);
        }

        halfTotalBalls = totalBalls / 2;
        this.balls = balls;

        // Precompute binomial coefficients using Pascal's triangle
        int maxSize = Math.max(maxBallsPerColor, totalBalls);
        binomialCoefficients = new long[maxSize + 1][maxSize + 1];
        for (int n = 0; n <= maxSize; n++) {
            binomialCoefficients[n][0] = 1;
            for (int k = 1; k <= n; k++) {
                binomialCoefficients[n][k] = binomialCoefficients[n - 1][k - 1] + binomialCoefficients[n - 1][k];
            }
        }

        long validDistributions = dfs(0, halfTotalBalls, 0);
        long totalDistributions = binomialCoefficients[totalBalls][halfTotalBalls];

        return validDistributions * 1.0 / totalDistributions;
    }

    private long dfs(int colorIndex, int remainingBallsForBox1, int colorDifference) {
        if (colorIndex >= balls.length) {
            return (remainingBallsForBox1 == 0 && colorDifference == 0) ? 1 : 0;
        }

        if (remainingBallsForBox1 < 0) {
            return 0;
        }

        List<Integer> state = Arrays.asList(colorIndex, remainingBallsForBox1, colorDifference);
        if (memoization.containsKey(state)) {
            return memoization.get(state);
        }

        long totalWays = 0;
        for (int ballsToBox1 = 0; ballsToBox1 <= balls[colorIndex]; ballsToBox1++) {
            int colorDifferenceChange;
            if (ballsToBox1 == balls[colorIndex]) {
                colorDifferenceChange = 1;
            } else if (ballsToBox1 == 0) {
                colorDifferenceChange = -1;
            } else {
                colorDifferenceChange = 0;
            }

            long waysForThisDistribution = dfs(colorIndex + 1, remainingBallsForBox1 - ballsToBox1, colorDifference + colorDifferenceChange);
            totalWays += waysForThisDistribution * binomialCoefficients[balls[colorIndex]][ballsToBox1];
        }

        memoization.put(state, totalWays);
        return totalWays;
    }
}
