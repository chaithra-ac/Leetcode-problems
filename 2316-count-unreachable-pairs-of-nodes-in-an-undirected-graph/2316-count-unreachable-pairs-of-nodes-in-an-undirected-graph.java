class Solution {
    int com=1;
    public long countPairs(int n, int[][] edges) {
     List<List<Integer>>e=new ArrayList<>();
     boolean[]vis=new boolean[n];
        for(int i=0;i<n;i++)
            e.add(new ArrayList<>());
        
        for(int[]edg:edges){
            e.get(edg[0]).add(edg[1]);
            e.get(edg[1]).add(edg[0]);
        }
        long res=0,unvis=n;
        List<Integer>set=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                com=0;
                dfs(i,vis,e);
                unvis-=com;
                res+=unvis*com;
                
            }
        }
        // System.out.print(set+" "+Arrays.toString(vis));
        /*for(int i=0;i<set.size();i++){
            for(int j=i+1;j<set.size();j++){
                res+=set.get(i)*set.get(j);
            }
        }*/
        return res;
    }
    void dfs(int n,boolean[]vis,List<List<Integer>> e){
        vis[n]=true;
        ++com;
        for(int adj:e.get(n)){
            if(!vis[adj]){
                dfs(adj,vis,e);
            }
        }
    }
}