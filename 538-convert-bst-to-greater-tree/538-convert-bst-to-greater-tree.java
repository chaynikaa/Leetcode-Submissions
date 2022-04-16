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
//     int sum = 0;
//     public TreeNode convertBST(TreeNode root) {
        
//         if(root==null)
//             return null;
        
//         convertBST(root.right);
//         sum  = sum + root.val;
//         root.val = sum;
//         convertBST(root.left);
        
//         return root;
//     }
// }

class Solution {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        
        if(root==null)
            return null;
        
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        
        while(st.size()!=0 || node!=null){
         while(node!=null){
            st.push(node);
            node = node.right;
        }
        node = st.pop();
        sum = sum + node.val;
        node.val = sum;
        
        node = node.left;
            
        }

        
        return root;
    }
}