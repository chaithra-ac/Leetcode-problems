class Solution {
    int max=0;
    int[][]dp;
    public int findLength(int[] nums1, int[] nums2) {
     dp = new int[nums1.length][nums2.length];
        for(int[]i:dp)
        Arrays.fill(i,-1);
         compute(nums1,nums2,nums1.length-1,nums2.length-1);
        return max;
    }
    int compute(int[] n1, int[] n2,int x,int y){
        if(x<0||y<0)return 0;
        else if(dp[x][y] != -1) return dp[x][y];
        else{
        int cur=0;
        if(n1[x]==n2[y]){
            cur=1+compute(n1,n2,x-1,y-1);
            max=Math.max(max,cur);
            
        }                      
            compute(n1,n2,x-1,y);
            compute(n1,n2,x,y-1);
        
         dp[x][y] = cur;
        return cur;
        }
        
    }
              
}