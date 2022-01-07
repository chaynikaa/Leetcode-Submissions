/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {                                 //O(1) SPACE SOLUTION
    private ListNode head;       //RESERVOIR SAMPLING
     
    public Solution(ListNode head) { 
        this.head = head;
        
    }
    
    public int getRandom() {
        int i=1;
        int res = 0;
        ListNode curr = head;
        while(curr!=null){
            if(Math.random() < 1.0/i){
                res = curr.val;
            }
            i++;
            curr=curr.next;
        }
     return res;   
    }
}

// class Solution {                                 //O(n) SPACE SOLUTION
//     List<Integer> val = new ArrayList<>();
     
//     public Solution(ListNode head) {
        
//         while(head!=null){
//             val.add(head.val);
//             head = head.next;
//         }
        
//     }
    
//     public int getRandom() {
//         return val.get((int)(Math.random() * val.size()));
//     }
// }

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */