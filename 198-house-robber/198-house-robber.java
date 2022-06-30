class Solution {
    int[]dp;
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        dp[0] = nums[0];
        if(nums.length>1)
        dp[1] = Math.max(dp[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
       return dp[nums.length-1];
    }
    int compute(int[]nums,int n){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=Math.max(nums[n]+compute(nums,n-2),compute(nums,n-1));
    }
}