class Solution {
    int max=0;
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        boolean[]vis=new boolean[n];
        List<ArrayList<Integer>>list=new ArrayList<>();
        for(int i:restricted)vis[i]=true;
        for(int i=0;i<n;i++)
            list.add(new ArrayList<>());
        for(int[]ed:edges){
            list.get(ed[0]).add(ed[1]);
            list.get(ed[1]).add(ed[0]);
        }
                dfs(0,list,n,vis);
        return max;
    }
    
    int dfs(int cur,List<ArrayList<Integer>>list,int n,boolean[]vis){
        if(vis[cur])return 0;
        vis[cur]=true;
        max++;
        for(int adj:list.get(cur)){
            if(!vis[adj]){
                dfs(adj,list,n,vis);
            }
        }
        return max;
    }
}