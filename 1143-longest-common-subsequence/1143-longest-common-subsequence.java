class Solution {
    int dp[][];
    public int longestCommonSubsequence(String s1, String s2) {
      int n=s1.length(),n2=s2.length();
        dp=new int[n][n2];
        return compute(s1,s2,n-1,n2-1);
    }
    int compute(String s1,String s2,int n,int m){
        if(n<0||m<0)return 0;
        if(dp[n][m]!=0)return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m))
            return dp[n][m]=1+compute(s1,s2,n-1,m-1);
        else
            return dp[n][m]=Math.max(compute(s1,s2,n,m-1),compute(s1,s2,n-1,m));
    }
}