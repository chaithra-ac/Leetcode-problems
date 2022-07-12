class Solution {
    int dp[];
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length-1;
        dp=new int[n+1];
      return Math.min(compute(cost,n),compute(cost,n-1));  
    }
   int compute(int[]nums,int n){
        if(n<0)return 0;
        if(dp[n]!=0)return dp[n];
         if(n==0)return nums[0];
         if(n==1)return nums[1];
        return dp[n]=nums[n]+Math.min(compute(nums,n-1),compute(nums,n-2));
    }
}