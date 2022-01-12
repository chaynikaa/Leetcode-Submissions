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

//iterative approach. same time complexity but O(1) space complexity

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        TreeNode node  = root;
        
        while(node!=null){
            if(node.val>val){
                if(node.left == null){
                    node.left = new TreeNode(val);
                    return root;
                } else
                    node = node.left;
            } else {
                if(node.right == null){
                    node.right = new TreeNode(val);
                    return root;
                }
                else
                    node = node.right;
            }
        }
        
        return new TreeNode(val);
    }
}

//recursive solution. O(h) time complexity. O(log N) in average case and O(n) in worst case. SAME SPACE COMPLEXITY

// class Solution {                                      
//     public TreeNode insertIntoBST(TreeNode root, int val) {
        
//         if(root==null){
//             return new TreeNode(val);
//         }
            
//         if(root.val>val)                               
//             root.left = insertIntoBST(root.left,val);
                
//         else
//             root.right = insertIntoBST(root.right,val);
          
//         return root;
//     }
// }