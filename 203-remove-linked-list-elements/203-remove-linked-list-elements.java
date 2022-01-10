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
class Solution {                                        
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        ListNode curr = head;

        while(curr!=null){
            if(curr.val != val){   //updating the res only when the curr val is not equal to the given val
                res.next = curr;   //pointing the res to curr
                res = res.next;    //moving the res pointer ahead
            }
          curr = curr.next;       //moving the curr point ahead
        }
        
        res.next = curr;    //if the last node is to be deleted for this case
        
        return dummy.next;
    }
}


// class Solution {                                     //Recursive Approach
//     public ListNode removeElements(ListNode head, int val) {
        
//         if(head == null){
//             return null;
//         }
        
//         if(head.val == val)
//             return removeElements(head.next,val);
        
//         head.next = removeElements(head.next,val);
        
//         return head;
//     }
// }