class Solution {
     boolean temp=true;
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[]col=new int[n];
         for(int i=0;i<n;i++){
             if(col[i]==0&&!dfs(graph,i,1,col)){
                     return false;
                 }
         }
        return true;
    }
    boolean dfs(int[][]graph,int node,int c,int[]col){
        if(col[node]!=0)return col[node]==c;
        col[node]=c;
     for(int adj:graph[node]){
        if(!dfs(graph,adj,-c,col))return false;
        }
    return true;
    }
}