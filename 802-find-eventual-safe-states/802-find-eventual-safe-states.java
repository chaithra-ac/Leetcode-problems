class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n=graph.length;
        List<Integer>list=new ArrayList<>();
             int[]vis=new int[n];
      for(int i=0;i<n;i++){
              if(bfs(i,graph,vis)==1)
                  list.add(i);
      }
        return list;
    }
    int bfs(int n,int[][]g,int[]vis){
        if(vis[n]!=0)
            return vis[n];
          vis[n]=-1;
        for(int adj:g[n]){
                if(bfs(adj,g,vis)==-1)
                    return -1;
        }
        return vis[n]=1;
    } 
}