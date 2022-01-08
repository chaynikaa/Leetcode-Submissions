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
        ListNode temph=head;
        
        while(fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = slow.next;
        slow.next=null;
        System.out.println(head2.val);
        ListNode rev = reverseList(head2);
        temph = head;
        
        while(rev!=null && temph!=null){
            int sum = rev.val + temph.val;
            max = Math.max(max,sum);
            temph = temph.next;
            rev = rev.next;
        }
        
       return max; 
    }

        public ListNode reverseList(ListNode head) {
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