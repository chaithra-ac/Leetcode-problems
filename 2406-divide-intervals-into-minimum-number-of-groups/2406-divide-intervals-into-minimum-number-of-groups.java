class Solution {
    public int minGroups(int[][] intervals) {
        int res=0,max=Integer.MIN_VALUE;
        int[]dp=new int[1000002];
        for(int i=0;i<intervals.length;i++){
            dp[intervals[i][0]]++;
            dp[intervals[i][1]+1]--;
        }
        for(int i=1;i<dp.length;i++){
            dp[i]+=dp[i-1];
            res=Math.max(res,dp[i]);
        }
        
        return res;
    }
}

