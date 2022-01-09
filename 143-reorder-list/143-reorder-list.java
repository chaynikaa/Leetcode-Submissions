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
    public void reorderList(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode thead = slow.next;
        slow.next=null;
        ListNode rev = reverse(thead);

        int i=0;
        
        while(rev!=null && head!=null){
            if (i%2==0){
                ListNode temp = head.next;
                head.next=rev;
                head=temp;  
            }            
            else{
                ListNode temp2 = rev.next;
                rev.next = head;
                rev = temp2;
            }
            i++;
        }
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode temp = null;
        
        while(head!=null){
            ListNode next = head.next;
            head.next = temp;
            temp=head;
            head = next;
        }
        return temp;
    }
}