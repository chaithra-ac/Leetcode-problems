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
    TreeNode templ,tempr,toRightLeaf;
    public void flatten(TreeNode root) {
      if(root==null)return;
         templ=root.left;
         tempr=root.right;
         root.right=root.left=null;
         root.right=templ;
         toRightLeaf=root;
        while(toRightLeaf.right!=null){
            toRightLeaf=toRightLeaf.right;
            }
        toRightLeaf.right=tempr;
        flatten(root.left);
        flatten(root.right);
    }
}