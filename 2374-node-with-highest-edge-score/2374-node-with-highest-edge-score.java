class Solution {
   long max=0;int node=-1;
    public int edgeScore(int[] edges) {
        int n=edges.length;
        long temp=0;
        HashMap<Integer,Long>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(edges[i]))
            map.put(edges[i],map.get(edges[i])+i);
            else map.put(edges[i],(long)i);
            temp=map.get(edges[i]);
            if(max<temp){
                max=temp;
                node=edges[i];
            }
            else if(max==temp&&node>edges[i])
                node=Math.min(node,edges[i]);
        }
        return node;
    }
}