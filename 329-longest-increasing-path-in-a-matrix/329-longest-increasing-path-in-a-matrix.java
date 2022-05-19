class Pair{
    int val;
    int pathval;
    int a;int b;
    // Pair(int val){this.val=val;}
    // Pair(int pathval){this.pathval=pathval;}
    Pair(int val,int pathval,int a,int b){this.val=val; this.pathval=pathval;
                                         this.a=a;this.b=b;}

}
class Solution {
    int max=1,ob=0;
    int[][]dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
    // Deque<Pair>queue=new LinkedList<>();
        int[][]c=new int[matrix.length][matrix[0].length];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
               ob=dfs(matrix,i,j,matrix.length,matrix[0].length,c);
                   System.out.println("index "+i+" "+j+" "+ob);
               if(ob>max){
                   max=ob;}
               
           }
       }
        return max;
    }
public int dfs(int[][] matrix, int i, int j, int m, int n, int[][] cache) {
    if(cache[i][j] != 0) return cache[i][j];
    int max = 1;
    for(int[] di: dir) {
        int x = i + di[0], y = j + di[1];
        if(x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[i][j]) continue;
        int len = 1 + dfs(matrix, x, y, m, n, cache);
        max = Math.max(max, len);
    }
    cache[i][j] = max;
    return max;
}
}