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
    public int sumRootToLeaf(TreeNode root) {
        
        int ans = 0;
        int curr = 0;
        int steps;
        TreeNode pred;
        
        while(root!=null){
            if(root.left!=null){
                pred = root.left;
                steps = 1;
                
                while(pred.right!=null && pred.right!=root){
                    pred = pred.right;
                    ++steps;
                }
                
                if(pred.right == null){
                    curr = (curr<<1) | root.val;
                    pred.right = root;
                    root = root.left;
                } else {
                    if(pred.left == null)
                        ans = ans+curr;
                    for(int i=0;i<steps;++i)
                        curr>>=1;
                    
                    pred.right=null;
                    root = root.right;
                }
            }else{
                curr = (curr<<1) | root.val;
                
                if(root.right == null)
                    ans = ans+curr;
                root = root.right;
            }
        }
        
        return ans;
    }
}