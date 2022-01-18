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
    int sum=0,max=0;
    public int deepestLeavesSum(TreeNode root) {
        compute(root,0);
        return sum;
    }
    private void compute(TreeNode root,int level){
        if(root==null)return;
            if(root.left==null&&root.right==null){
                if(max<level){
                    max=level;
                  sum=root.val; 
                }
                else if(max==level){
                    sum+=root.val;
                }
            }
        compute(root.left,level+1);
        compute(root.right,level+1);
    }
}