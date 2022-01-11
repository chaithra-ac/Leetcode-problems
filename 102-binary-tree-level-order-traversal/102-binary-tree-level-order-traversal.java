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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>>outer=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root!=null)
            q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            outer.add(new ArrayList<>());
            for(int i=0;i<s;i++){
                TreeNode cur=q.peek();
                if(cur.left!=null)
                    q.add(cur.left);
                if(cur.right!=null)
                    q.add(cur.right);
                outer.get(outer.size()-1).add(q.poll().val);  
            }
            
        }
        return outer;
    }
}