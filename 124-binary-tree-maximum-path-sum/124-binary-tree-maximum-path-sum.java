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
        int max=Integer.MIN_VALUE;        

    public int maxPathSum(TreeNode root) {
        maxpathSum(root);
        return max;
    }
    int maxpathSum(TreeNode root){
      if(root==null)return 0;
        
        int l=Math.max(maxpathSum(root.left),0);
        int r=Math.max(maxpathSum(root.right),0);
        max=Math.max(max,l+r+root.val);
        return root.val+Math.max(l,r);
    }
    
}