class Solution {
   long max=0;int node=-1;
    public int edgeScore(int[] edges) {
        int n=edges.length;
        HashMap<Integer,Long>map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(edges[i]))
            map.put(edges[i],map.get(edges[i])+i);
            else map.put(edges[i],(long)i);
        } 
        for(int i:map.keySet()){
        long temp=map.get(i);
            
            if(max<temp){
                max=temp;
                node=i;
            }
            else if(max==temp&&node>i)
                node=Math.min(node,i);
        }
        return node;
    }
}