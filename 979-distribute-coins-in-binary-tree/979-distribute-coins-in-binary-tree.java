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
    int ans = 0;
    public int distributeCoins(TreeNode root) {
        
        helper(root);                               
        return ans;
        
    }
     
    public int helper(TreeNode root){       //need to make diff function to return ans
        
        if(root == null)                    //base case
            return 0;
        
        int left = helper(root.left);        
        
        int right = helper(root.right);
        
        ans = ans + Math.abs(left) + Math.abs(right);      //final ans
        
        return left+right+root.val-1;                 //requirement from left and right side -1->its own req  
    }
}