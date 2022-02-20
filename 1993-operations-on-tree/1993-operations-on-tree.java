/*
Define a data structure "Node" to store all information about a single node and connecting the tree.
Use a map to access any node in O(1)
Finally impliment the functions as requested.

In upgrade functions, I check for all 3 conditions one by one.

The node is unlocked - East to check, since I just need to read node attribute
It has at least one locked descendant (by any user) -Did a DFS on the descendant and returned true if any node attribute "isLocked" is true.
It does not have any locked ancestors.- Easy to check, since we are storing the parent of each node as an attribute "parent". We just need to use a while loop until node become null and keep moving up the tree.
Follow-up: This solution will work for any number of connecting nodes and not just binary tree.

*/
class LockingTree {

    class Node{
        int val;
        List <Node> descendants=new ArrayList<>();;
        Node parent = null;
        boolean isLocked = false;
        int lockedBy;
        Node( int val){
            this.val = val;
        }
        
        Node( int val, Node parent){
            this.val = val;
            this.parent = parent;
        }
    }
    
    Map <Integer, Node> tree=new HashMap<>();
    
    public LockingTree(int[] parent) {
        
        tree.put(0, new Node(0, null));
        
        for(int child = 1; child<parent.length;child++){
            
            tree.putIfAbsent(child, new Node(child));
            
            tree.putIfAbsent(parent[child], new Node(parent[child]));
            
            Node childNode = tree.get(child);
            Node parentNode = tree.get(parent[child]);
            
            //System.out.println(childNode.val + " "+parentNode.val);
            
            childNode.parent = parentNode;
            parentNode.descendants.add(childNode);
            
        }
    }
    
    public boolean lock(int num, int user) {
      // System.out.println()  
        /*
        for(Map.Entry<Integer,Node>map:tree.entrySet()){
            Node temp=map.getValue();
         System.out.println(map.getKey()+" "+temp.val);}
        */
        
        Node node = tree.get(num);
        if(node.isLocked ==false){
            node.isLocked = true;
            node.lockedBy =user;
            return true;
        }
        else
            return false;
    }
    
    public boolean unlock(int num, int user) {
        Node node = tree.get(num);
        if(node.isLocked == true && node.lockedBy ==user){
            node.isLocked = false;
            return true;
        }
        else
            return false;
    }
    
    public boolean upgrade(int num, int user) {
        Node node = tree.get(num);
        
        boolean cond1 = (node.isLocked == false);
        if(!cond1) return false;
        
        //cond2
        boolean cond2 = false;
        if(!node.descendants.isEmpty()){
            for(Node child : node.descendants){
                if(checkDescendant(child))
                    cond2 = true;
                }
        }
        else
            return false; // no descendants
        if(!cond2) return false;
        boolean cond3 = checkAncestors(node.parent);
        if(cond3 ==false) return false;
        
        //now we need to unlock descendants
        for(Node child : node.descendants)
            unlockDescendant(child);
        
        node.isLocked =true;
        node.lockedBy = user;
        
        return true;
    }
    
    
    private void unlockDescendant(Node node){
        //if any Descendant is locked, unlock it
        
        node.isLocked =false;
        
        if(!node.descendants.isEmpty()){
            for(Node child : node.descendants)
                unlockDescendant(child);
        }
        
    }
    
    
    private boolean checkDescendant(Node node){
        //if any Descendant is locked, return true
        
        if(node.isLocked)
            return true;
        
        if(!node.descendants.isEmpty()){
            for(Node child : node.descendants){
                if(checkDescendant(child))
                    return true;
                }
        }
        
        return false;
    }
    
    private boolean checkAncestors(Node node){
        //if any Ancestors is locked, return false
        
        while(node !=null){
            if(node.isLocked ==true)
                return false;
            node = node.parent;
        }
        
        return true;
    }
    
}
