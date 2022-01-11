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
            List<List<Integer>>list=new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        compute(root,0);
        return list;
    }
    private void compute(TreeNode root,int level){
        if(root==null)
            return;
        if(list.size()<=level){
            list.add(new ArrayList());
        }
        list.get(level).add(root.val);
        compute(root.left,level+1);
        compute(root.right,level+1);
    }
}