class Solution {
    int m,n;
    public boolean findRotation(int[][] matrix, int[][] target) {
        m=matrix.length;
        n=matrix[0].length;
        for(int i=0;i<4;i++){
            // System.out.print(i+" ");
            if(Arrays.deepEquals(target,matrix))return true;
            else rotate(matrix);
            for(int x=0;x<m;x++){
                for(int y=0;y<n;y++){
                    System.out.print(matrix[x][y]+" ");
                }
                System.out.println();
            }
            
        }
        return false;
        
    }
    public void rotate(int[][] matrix) {
      for(int i=0;i<n;i++){
          for(int j=i+1;j<m;j++){
              int temp=matrix[i][j];
              matrix[i][j]=matrix[j][i];
              matrix[j][i]=temp;
          }
      }
       for(int i=0;i<m;i++){
         for(int j=0;j<n/2;j++){
          int tem=matrix[i][j];
             matrix[i][j]=matrix[i][n-j-1];
             matrix[i][n-j-1]=tem;
         }
       }
    }
}