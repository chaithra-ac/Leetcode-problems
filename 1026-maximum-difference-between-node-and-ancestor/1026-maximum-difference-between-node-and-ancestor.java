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
    List<Integer>l=new ArrayList<>();
    int max=0;
    public int maxAncestorDiff(TreeNode root) {
        max(root);
        return max;
    }
    private int max(TreeNode r){
        if(r==null)return max;
        l.add(r.val);
        max(r.left);
        int ri=r.val;
        max=max<Math.abs(Collections.min(l)-ri)?Math.abs(Collections.min(l)-ri):max<Math.abs(Collections.max(l)-ri)?Math.abs(Collections.max(l)-ri):max;
        max(r.right);
        if(l.size()>0)
            l.remove(l.size()-1); 
        return max;
    }
}