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
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode start = head;
        ListNode end = head;
        ListNode ans = head;
        
        while(start!=null && end!=null && end.next!=null){
            start = start.next;
            end = end.next.next;
            
            if(start == end){
                while(ans!=start){
                    ans=ans.next;
                    start=start.next;
                }
            return ans;
           }
        }
        return null;
    }
}