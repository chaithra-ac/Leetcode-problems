class LockingTree {

    class Node{
        int val;
        List <Node> descendants;
        Node parent = null;
        boolean isLocked = false;
        int lockedBy;
        Node( int val){
            this.val = val;
            this.descendants = new ArrayList<>();
        }
        
        Node( int val, Node parent){
            this.val = val;
            this.parent = parent;
            this.descendants = new ArrayList<>();
        }
    }
    
    Map <Integer, Node> tree;
    public LockingTree(int[] parent) {
        
        tree = new HashMap<>();
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
        if(cond1==false) return false;
        
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
        if(cond2 ==false) return false;
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
