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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0 ){
            
            int sum=0;         //initia;ise sum to 0 again
            
            if(l1!=null){         //if list 1 is present
                sum = sum+l1.val;
                l1=l1.next;
            }
              
            if(l2!=null){         //if list 2 is present
                sum = sum+l2.val;
                l2=l2.next;
            }
            
            sum = sum+carry;   //adding the sum to carry
            carry = sum/10;    //updating the new carry
            sum=sum%10;        //updating the sum 
            
            ListNode node=new ListNode(sum);  //additing the sum to new linkedlist
            temp.next = node;
            temp=temp.next;       
            
        }
        
        return ans.next;
        
    }
}