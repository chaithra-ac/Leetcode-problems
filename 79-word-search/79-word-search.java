class Solution {
    public boolean exist(char[][] b, String w) {
        boolean[][]visited=new boolean[b.length][b[0].length];
     for(int i=0;i<b.length;i++){
         for(int j=0;j<b[0].length;j++){
             if(b[i][j]==w.charAt(0)&&compute(i,j,b,w,visited,0))
                 return true;
         }
     }
        return false;
    }
    boolean compute(int i,int j,char[][]b,String w,boolean[][]visited,int x){
        if(x==w.length()){
            return true;
    }
        
        else if(i>=b.length||i<0||j>=b[0].length||j<0||
           w.charAt(x)!=b[i][j]||x>w.length()||visited[i][j]==true)
            return false;
        
             b[i][j]='+';
    boolean found=compute(i+1,j,b,w,visited,x+1)||compute(i-1,j,b,w,visited,x+1)||compute(i,j+1,b,w,visited,x+1)||compute(i,j-1,b,w,visited,x+1);
             b[i][j]=w.charAt(x);
             return found;
    }
}