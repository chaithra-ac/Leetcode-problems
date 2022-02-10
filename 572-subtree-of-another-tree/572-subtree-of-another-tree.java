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
    boolean b=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root==null)
          return b;
        
      if(root.val==subRoot.val)
           b=b||compute(root,subRoot);
        
        isSubtree(root.left,subRoot);
        isSubtree(root.right,subRoot);
        
    return b;
    }
    boolean compute(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null)return true;
        if(r1==null||r2==null)return false;
        
        if(r1.val==r2.val){
            return compute(r1.left,r2.left)&&compute(r1.right,r2.right);
        }
        else
            return false;   
    }
}