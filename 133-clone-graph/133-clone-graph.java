/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution{
Map<Integer, Node> nodesMap = new HashMap<>();

public Node cloneGraph(Node node) {
    
    if(node == null){
        return node;
    }
    
   return clone(node);
    
}

public Node clone(Node node){
    
    if(nodesMap.containsKey(node.val)){
        return nodesMap.get(node.val);
    }
    Node copy = new Node(node.val);
    nodesMap.put(node.val, copy);
    
    for(Node neighbor : node.neighbors){
        copy.neighbors.add(clone(neighbor));
    }
    
    return copy; 
 }
}

