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
    int sum;
    public int sumRootToLeaf(TreeNode root) {
      compute(root,"");
        return sum;
    }
    void compute(TreeNode root,String s){
        if(root==null)
            return;
         s+=root.val;
        if(root.left==null&&root.right==null){
          sum+=Integer.parseInt(s,2);
            return;
        }
        else{
        compute(root.left,s);
        compute(root.right,s);}
        }
}