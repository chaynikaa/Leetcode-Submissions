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
// class Solution {
//     public boolean isBalanced(TreeNode root) {
        
//         if(root == null)
//             return true;
        
//         int lh = height(root.left);
//         int rh = height(root.right);
        
//         if(Math.abs(lh-rh)>1)            //balanced condition checked
//             return false;
        
//         boolean left = isBalanced(root.left);       //call for left node
//         boolean right = isBalanced(root.right);     //call for right node
          
//         if(left==false || right==false)       
//             return false;
        
        
//         return true;
//     }

    
//     public int height(TreeNode node){          //max depth of a binary tree
        
//         if(node==null)
//             return 0;
        
//         int left = height(node.left);
//         int right = height(node.right);
        
//         return Math.max(left,right)+1;
        
//     }
// }

class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(height(root)==-1)
            return false;
        else
            return true;

    }
    
    public int height (TreeNode root){
        
        if(root == null)
            return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        if(lh==-1 || rh==-1)
            return -1;
        
        if(Math.abs(lh-rh)>1)
            return -1;
        
        return Math.max(lh,rh)+1;
    }

}