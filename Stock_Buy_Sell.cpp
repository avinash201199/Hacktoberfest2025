#include <iostream>
#include <vector>
using namespace std;

int maxProfit(vector<int> &prices) {  
    int n = prices.size();
    int res = 0;
  
    // Explore all possible ways to buy and sell stock
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j < n; j++) {
			res = max(res, prices[j] - prices[i]);
        }
    }
    return res;
}

int main() {
    vector<int> prices = {7, 10, 1, 3, 6, 9, 2};
    cout << maxProfit(prices) << endl;
    return 0;
}
