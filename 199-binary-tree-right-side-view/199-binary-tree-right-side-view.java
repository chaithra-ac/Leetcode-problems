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
    public List<Integer> rightSideView(TreeNode root) {
          compute(root,0); 
          return l;
    }
    private void compute(TreeNode root,int level){
        if(root==null)
            return ;
        if(level==l.size()){
            l.add(root.val);
        }
       compute(root.right,level+1);
        compute(root.left,level+1);
    }
}