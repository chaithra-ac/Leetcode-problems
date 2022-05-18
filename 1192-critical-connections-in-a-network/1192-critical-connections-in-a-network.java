class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<n;i++)
            list.add(new ArrayList());
        for (List<Integer> conn : connections) {
            list.get(conn.get(0)).add(conn.get(1));
            list.get(conn.get(1)).add(conn.get(0));
        }
    int timer[] = new int[1];
        List<List<Integer>> results = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int []timeStampAtThatNode = new int[n]; 
        criticalConnectionsUtil(list, -1, 0, timer, visited, results, timeStampAtThatNode);
        return results;
    }
    
    
    public void criticalConnectionsUtil(List<List<Integer>>graph, int parent, int node, int timer[], boolean[] visited, List<List<Integer>> results, int []timeStampAtThatNode) {
        visited[node] = true;
        timeStampAtThatNode[node] = timer[0]++;
        int currentTimeStamp = timeStampAtThatNode[node];
        
        for(int oneNeighbour : graph.get(node)) {
            if(oneNeighbour == parent) continue;
            if(!visited[oneNeighbour]) criticalConnectionsUtil(graph, node, oneNeighbour, timer, visited, results, timeStampAtThatNode);
            timeStampAtThatNode[node] = Math.min(timeStampAtThatNode[node], timeStampAtThatNode[oneNeighbour]);
            if(currentTimeStamp < timeStampAtThatNode[oneNeighbour]) results.add(Arrays.asList(node, oneNeighbour));
        }
        
        
    }
    
            
    
}