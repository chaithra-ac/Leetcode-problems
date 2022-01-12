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
      compute(root,0);
        return sum;
    }
    void compute(TreeNode root,int n){
        if(root==null)
            return;
         n=(n<<1)|root.val;
        if(root.left==null&&root.right==null){
          sum+=n;
            return;
        }
        else{
        compute(root.left,n);
        compute(root.right,n);
        }
    }
}