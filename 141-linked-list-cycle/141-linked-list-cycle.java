/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public boolean hasCycle(ListNode head) {   //APPROACH-1 FLOYD'S CYCLE  
        if(head == null)
            return false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast)
                return true;
        }
        
        return false;
    }
}


//APPROACH - 2 -> HASHING-> KEEP ADDING NODES IN HASH SET. IF ANY NODE REPEATS THAT MEANS CYCLE IS DETECTED.

// public class Solution {                           //APPROACH-3 ONE PASS.
//     public boolean hasCycle(ListNode head) {
        
//       ListNode temp = new ListNode();
//         while(head!=null){
//             if(head.next == null){
//                 return false;
//             }
          
//             if(head.next == temp){
//                 return true;
//             }
            
//             ListNode temp1 = head.next;
//             head.next = temp;
//             head = temp1; 
//         }
     
//      return false;   
//     }
// }