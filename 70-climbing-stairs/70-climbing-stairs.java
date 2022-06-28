class Solution {
    int sum=0;
    int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
       compute(n);
        // System.out.print(Arrays.toString(dp));
        return dp[n];
    }
    int compute(int n){
       if(n==0)
           return 1;
        if(n<0)return 0;
        if(dp[n]!=0)return dp[n];
        return dp[n]=compute(n-1)+compute(n-2);
    }
}



