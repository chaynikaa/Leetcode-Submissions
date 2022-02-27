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
class Pair{                  //pair class
    TreeNode node;
    int num;
    Pair(TreeNode node ,int num){
        this.num = num;
        this.node = node;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root == null)       
            return 0;
        
        int ans = 0;
        //level order traversal
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));         
        
        while(q.size()>0){
            int size = q.size();
            int min = q.peek().num;   
            int first = 0,last=0;
            
            for(int i=0;i<size;i++){
                int curr = q.peek().num-min;
                TreeNode node = q.peek().node;
                q.remove();    //removing the exisiting node
                
                if(i==0)        //first index of a particular level
                    first = curr;
                
                if(i==size-1)   //last index of a particular level
                    last = curr;
                
                if(node.left!=null)
                    q.add(new Pair(node.left,curr*2 + 1));   //setting the value of the nodes
                
                if(node.right!=null)
                    q.add(new Pair(node.right, curr*2 + 2));
            }
            
            ans = Math.max(ans,last-first+1);   //calculating the max
        }
      return ans;  
    }
}