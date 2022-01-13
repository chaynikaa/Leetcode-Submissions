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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        LinkedList<Integer> queue = new LinkedList<>();
        
        if(root == null){
            return queue;
        }
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(st.size()!=0){
            TreeNode node = st.pop();
            queue.addFirst(node.val);
          
            if(node.left!=null){
                st.push(node.left);
            }
              
            if(node.right!=null){
                st.push(node.right);
            }
        } 
       return queue; 
    }
}

