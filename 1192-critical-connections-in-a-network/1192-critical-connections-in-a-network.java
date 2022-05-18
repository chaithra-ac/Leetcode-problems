class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(new ArrayList());
        for(List<Integer>l:connections){
            list.get(l.get(0)).add(l.get(1));
            list.get(l.get(1)).add(l.get(0));
            }
        List<List<Integer>> results = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int []timeStampAtThatNode = new int[n]; 
        criticalConnectionsUtil(list, -1, 0, 0, visited, results, timeStampAtThatNode);
        return results;
    }
    
    
    public void criticalConnectionsUtil(List<List<Integer>>graph, int parent, int node, int time, boolean[] visited, List<List<Integer>> results, int []timeStampAtThatNode) {
        visited[node] = true;
        timeStampAtThatNode[node] = time++;
        int currentTimeStamp = timeStampAtThatNode[node];
        
        for(int oneNeighbour : graph.get(node)) {
            if(oneNeighbour == parent) continue;
            if(!visited[oneNeighbour]) criticalConnectionsUtil(graph, node, oneNeighbour, time, visited, results, timeStampAtThatNode);
            timeStampAtThatNode[node] = Math.min(timeStampAtThatNode[node], timeStampAtThatNode[oneNeighbour]);
            if(currentTimeStamp < timeStampAtThatNode[oneNeighbour]) results.add(Arrays.asList(node, oneNeighbour));
        }
        
        
    }
    
            
    
}