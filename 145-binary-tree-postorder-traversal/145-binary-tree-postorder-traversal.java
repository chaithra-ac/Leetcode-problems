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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode>s=new Stack<>();
        LinkedList<Integer>l=new LinkedList<>();
        if(root==null)return l;
        s.push(root);
        while(!s.isEmpty()){
            
            TreeNode cur=s.pop();
            l.addFirst(cur.val);
            
            if(cur.left!=null)
                s.add(cur.left);
            
            if(cur.right!=null)
                s.add(cur.right);
        }
        return l;
    }
}