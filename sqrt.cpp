class Solution {
public:
    int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long long int i=2;
        while(i*i<=x){
            i+=1;
        }
        return --i;
    }
};
