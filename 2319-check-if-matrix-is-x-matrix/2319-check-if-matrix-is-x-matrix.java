class Solution {
    public boolean checkXMatrix(int[][] g) {
        int op=g.length-1,n=g.length;
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              // System.out.print(g[i][j]+" ");
              if((j==op||i==j)&&g[i][j]<=0)return false;
              else if(j!=op&&i!=j&&g[i][j]>0)return false;
          }
          op--;
      }
      return true; 
    }
}