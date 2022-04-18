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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        
        while(true){
            while(root!=null){
                st.push(root);
                root = root.left;
            }
            root = st.pop();
            if(--k==0)
                return root.val;
            else 
                root = root.right;
        }
    }
}


// class Solution {
//     public int kthSmallest(TreeNode root, int k) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         inorder(root,arr);
        
//         return arr.get(k-1);
//     }
    
//     private ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> ans){
//         if(root == null)
//             return ans;
        
//         inorder(root.left,ans);
//         ans.add(root.val);
//         inorder(root.right,ans);
        
//         return ans;
//     }
// }