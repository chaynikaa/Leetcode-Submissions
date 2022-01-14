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
    public List<List<Integer>> levelOrder(TreeNode root) {
         
        LinkedList<TreeNode> queue = new LinkedList<>();   //adapting linkedList as a queue using addLAst and removeFirst
        
        queue.addLast(root);     
        
        List<List<Integer>> ans = new ArrayList<>();
        
         if(root == null){             //null case
            return ans;
        }
        
        while(queue.size()>0){
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while(size-->0){
                TreeNode rem = queue.removeFirst();     
                temp.add(rem.val);
                
                if(rem.left != null){         //adding left child
                    queue.addLast(rem.left);
                }
                
                if(rem.right != null){       //adding right child
                    queue.addLast(rem.right);
                }
            }
          ans.add(temp);
        }
       return ans; 
    }
}