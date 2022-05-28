class Solution {
    public boolean isBipartite(int[][] g) {
        int[]v=new int[g.length];
       for(int i=0;i<g.length;i++){
           if(v[i]==0&&(!compute(g,v,i,1)))
               return false;
           }
        return true;
    }
    boolean compute(int[][]g,int []v,int node,int color){
        v[node]=color;
        for(int i:g[node]){
             if(v[i]==-color)
                 continue;
             if(v[i]==color||(!compute(g,v,i,-color)))
                 return false;
            
        }
        return true;
    }
}