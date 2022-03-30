class Solution {
    public boolean searchMatrix(int[][] mat, int t) {
     for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat[0].length;j++){
             if(mat[i][j]<=t&&mat[i][mat[0].length-1]>=t&&bs(i,mat,t,mat[0].length))
                 return true;
             else if(mat[i][j]>t)break;
             else continue;
         }
     } 
        return false;
    }
    boolean bs(int i,int[][]mat,int t,int e){
        int m=0,s=0;
        while(s<e){
            m=s+(e-s)/2;
            if(mat[i][m]==t)return true;
            else if(mat[i][m]<t)s=m+1;
            else e=m;
        }
        return false;
    }
}