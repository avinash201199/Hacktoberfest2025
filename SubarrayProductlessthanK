class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       int count=0,pro=1,j=0;
      for(int i=0;i<nums.length;i++){
        pro*=nums[i];
        while(pro>=k && j<=i){
            pro/=nums[j++];
        }
        count+=i-j+1;
      }return count;
         
    }
}
