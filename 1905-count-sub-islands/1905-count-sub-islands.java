class Solution {
    int m,n,res;
    boolean[][]b;
    public int countSubIslands(int[][] g1, int[][] g2) {
        m=g1.length;
        n=g2[0].length;
        b=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!b[i][j]&&g2[i][j]==1)
                    res+=compute(g1,g2,i,j);
            }
        }
        return res;
    }
    int compute(int[][]g1,int[][]g2,int i,int j){
        if(i<0||j<0||i>=m||j>=n||g2[i][j]==0||b[i][j])
            return 1;
        else if(g1[i][j]!=g2[i][j])
            return 0;
        b[i][j]=true;
        return compute(g1,g2,i+1,j)*
            compute(g1,g2,i,j+1)*
            compute(g1,g2,i-1,j)*
            compute(g1,g2,i,j-1);         
    }
}