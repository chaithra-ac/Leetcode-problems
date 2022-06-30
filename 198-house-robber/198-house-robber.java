class Solution {
    int[]dp;
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
       return compute(nums,nums.length-1); 
    }
    int compute(int[]nums,int n){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=Math.max(nums[n]+compute(nums,n-2),compute(nums,n-1));
    }
}