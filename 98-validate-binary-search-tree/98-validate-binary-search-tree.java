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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);    
    }
    
    public boolean isValidBST(TreeNode root, long min, long max){
        
        if(root==null)                 //base case
            return true;
        
        if(root.val>=max || root.val<=min)     //not valid
            return false;
        
        boolean left = isValidBST(root.left,min,root.val);    //checking left tree
        boolean right = isValidBST(root.right,root.val,max);  //checking right tree
         
        return left&&right;
        
    }
}