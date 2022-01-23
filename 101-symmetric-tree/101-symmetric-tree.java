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
    public boolean isSymmetric(TreeNode root) {
        
//check if the root is alone without left or right child if yes, its symmetric 
        
        if(root.left==null&&root.right==null)
            return true;
        
//check if the root node has left or right child only if yes,declare here itself has its not symmetric
        
        if(root.left==null||root.right==null) 
            return false;
        
// else check with all elements about its symmetric ness
        
    return check(root,root);
    }
    
    private boolean check(TreeNode l,TreeNode r){
        
// returns true if we sucussfully reached the end of the tree node checking its symmetry
        
        if(l.left==null&&r.right==null)
            return true;
        
// return false if values of left child didnt match with the right child
// returns false if anywhere we found to have a left child or right child but not both
        
         else if(l.left==null||r.right==null||l.left.val!=r.right.val)
            return false;
        
        
//checks recursively the entire tree about its symmetry in both left and right child if either of the recusion call returns false then we will return false else true
        
        return check(l.left,r.right)&& check(r.right,l.left);
        
    }
}