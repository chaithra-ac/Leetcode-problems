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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     Queue<TreeNode>q=new LinkedList<>();
      List<List<Integer>>outer=new ArrayList();
        if(root==null)return outer;
        q.add(root);
        int f=0;
        while(!q.isEmpty()){
        List<Integer>l=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
            TreeNode cur=q.poll();
                l.add(cur.val);
            if(cur.left!=null)
                q.add(cur.left);
            if(cur.right!=null)
                q.add(cur.right);  
            }
            if(f==1){
                Collections.reverse(l);
                outer.add(l);
            }
            else
                outer.add(l);
           f=f==0?1:0;
            
        }
        return outer;
    }
}