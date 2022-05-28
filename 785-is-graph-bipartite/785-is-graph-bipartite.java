class Solution {
    public boolean isBipartite(int[][] g) {
      int v[]=new int[g.length]; 
        for(int i=0;i<g.length;i++){
            Queue<Integer>q=new LinkedList<>();
            if(v[i]==0){
                q.add(i);
                // int color=1;
                v[i]=1;
                while(!q.isEmpty()){
                  int node=q.poll();
                    // color=-color;
                    for(int adj:g[node]){
                        if(v[adj]==v[node])return false;

                        else if(v[adj]==0){
                            v[adj]=-v[node];
                            q.add(adj);  
                        }                        
                    }
                    System.out.println(q);
                }
            }
        }
        return true;
    }
}