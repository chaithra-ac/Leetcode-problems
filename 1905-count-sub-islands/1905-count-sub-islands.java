class Solution {
    int m,n,res;
    public int countSubIslands(int[][] g1, int[][] g2) {
        m=g1.length;
        n=g2[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g2[i][j]==1)
                    res+=compute(g1,g2,i,j);
            }
        }
        return res;
    }
    int compute(int[][]g1,int[][]g2,int i,int j){
        if(i<0||j<0||i>=m||j>=n||g2[i][j]==0)
            return 1;
        else if(g1[i][j]!=g2[i][j])
            return 0;
        g2[i][j]=0;
        return compute(g1,g2,i+1,j)*
            compute(g1,g2,i,j+1)*
            compute(g1,g2,i-1,j)*
            compute(g1,g2,i,j-1);         
    }
}