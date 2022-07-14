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
    public TreeNode buildTree(int[] pre, int[] in) {
    return helper(pre,in,0,0,in.length-1);
    }
    private TreeNode helper(int[]pre,int[]in,int ppos,int is,int ie){
        
        if(ppos>pre.length||is>ie)return null;
       TreeNode node=new TreeNode(pre[ppos]);
        int pii=0;
        for(int i=0;i<=ie;i++){
            if(pre[ppos]==in[i])pii=i;
        }
        node.left=helper(pre,in,ppos+1,is,pii-1);
        node.right=helper(pre,in,ppos+1+pii-is,pii+1,ie);
        return node;
    }
}