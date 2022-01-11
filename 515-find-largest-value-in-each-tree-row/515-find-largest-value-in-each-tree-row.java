/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>l=new ArrayList<>();
    
    public List<Integer> largestValues(TreeNode root) {
      compute(root,0);
        return l;
    }
    private void compute(TreeNode root,int level){
        if(root==null)
            return;
        if(l.size()==level){
            l.add(level,root.val);
        }
        else if(l.get(level)<root.val){
            l.set(level,root.val);
        }
        
        compute(root.left,level+1);
        compute(root.right,level+1);
          
    }
}