class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[]vis=new boolean[rooms.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int cur=q.poll();
            for(int adj:rooms.get(cur)){
                if(!vis[adj]){
                    vis[adj]=true;
                    q.add(adj);
                }
            }
        }
        for(boolean i:vis)if(!i)return false;
        return true;
    }
}