class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
     for(int i=0;i<nums.length;i++)
        sum+=nums[i]; 
      if(sum%2!=0)
          return false;
      else{
          boolean []t[]=new boolean[nums.length+1][sum/2+1];
          return compute(nums,sum/2,nums.length-1,t);
      }
    }
    public boolean compute(int[]nums,int sum,int n,boolean[][]dp){
               for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0 || j==0)
                    dp[i][j] = false;
                else if(nums[i-1] > j)     // if curr sum value is greater than the current element value then just skip(take previous value)
                    dp[i][j] = dp[i-1][j];
                else if(nums[i-1]==j)  // we got required sum
                    dp[i][j] = true;
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        return dp[n][sum];
            }
}