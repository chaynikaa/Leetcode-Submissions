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
    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
     
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast.next!=null ){           //moving to the mid element
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow.next;         //storing the head of the second half of the last
        slow.next=null;                     
        ListNode rev = reverseList(head2);  //reverse the last half
        
        while(rev!=null && head!=null){    //summing the vals
            int sum = rev.val + head.val;
            max = Math.max(max,sum);       //storing the max
            head = head.next;
            rev = rev.next;
        }
        
       return max; 
    }

        public ListNode reverseList(ListNode head) {    //function to reverse the list
        ListNode temp = null;
        
        while(head!=null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head=next;; 
        }
        
        return temp;  
        
    }
}