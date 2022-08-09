class Solution {
      List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer>l=new ArrayList<>();
        dfs(0,graph,l);
        return list;
    }
    void dfs(int cur,int[][]g,List<Integer>l){
       if(l.contains(cur))return;
        l.add(cur);
        if(cur==g.length-1){
            list.add(new ArrayList(l));
            // System.out.print(l);
            return;
        }
        for(int adj:g[cur]){
            if(!l.contains(adj)){
                // System.out.println(l+" "+adj);
                dfs(adj,g,l);
                l.remove(l.size()-1);
            }
        }  
    }
}