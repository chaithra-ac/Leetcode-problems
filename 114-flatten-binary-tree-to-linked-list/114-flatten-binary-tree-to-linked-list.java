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
    public void flatten(TreeNode root) {
      if(root==null)return;
        TreeNode templ=root.left;
        TreeNode tempr=root.right;
        root.right=root.left=null;
        root.right=templ;
        TreeNode toRightLeaf=root;
        while(toRightLeaf.right!=null){
            toRightLeaf=toRightLeaf.right;
            }
        toRightLeaf.right=tempr;
        flatten(root.left);
        flatten(root.right);
    }
}