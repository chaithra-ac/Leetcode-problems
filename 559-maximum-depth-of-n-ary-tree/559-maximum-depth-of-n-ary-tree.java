/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Pair{
    int n;
    int d;
        public List<Node> children;
    public Pair(int n,int d,List<Node> _children){
        this.n=n;
        this.d=d;
        children = _children;
    }
}
class Solution {
    int max=0;
    public int maxDepth(Node root) {
        Queue<Pair>q=new LinkedList<>();
        if(root==null)return max;
        if(root.children.size()==0)return 1;
           q.add(new Pair(root.val,1,root.children));
        while(!q.isEmpty()){
            Pair node=q.poll();
            for(Node child:node.children){
                q.add(new Pair(child.val,node.d+1,child.children));
                if(node.d+1>max)max=node.d+1;
            }
        }
        return max;
    }
}