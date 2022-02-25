class Solution {
    boolean[][]vis;
    int m,n,res;
    public int numIslands(char[][] grid) {
       m=grid.length;
       n=grid[0].length;
       vis=new boolean[m][n];
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               if(grid[i][j]=='1'&&(!vis[i][j])){
                   res++;
                   dfs(grid,i,j);
               }
           }
       }
        return res;
        
    }
        void dfs(char[][]g,int i,int j){
        if(i<0||j<0||i>=m||j>=n||vis[i][j]||g[i][j]==0)return;
        if(g[i][j]=='1'){
        vis[i][j]=true;
            dfs(g,i+1,j);
            dfs(g,i,j+1);
            dfs(g,i-1,j);
            dfs(g,i,j-1);
        }
        }

}