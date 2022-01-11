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
 *    }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList();
      Stack<TreeNode>s=new Stack<>();
        TreeNode cur=root;
        while(!s.isEmpty()||cur!=null){
            while(cur!=null){
                s.push(cur);
            cur=cur.left;
            } 
            cur=s.pop();
            list.add(cur.val);
            cur=cur.right;
        }
        return list;
    }
}