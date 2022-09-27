class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int out[]=new int[n]; 
        List<Integer>res=new ArrayList<>();
        
       
        for(List<Integer>edg:edges)
            out[edg.get(1)]=-1;
        
        
        for(int i=0;i<out.length;i++){
            if(out[i]==0){
                res.add(i);
            }
        }
       return res; 
    }

}