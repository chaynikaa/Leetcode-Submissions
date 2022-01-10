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
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
//       if(list1 == null){
//           return list2;
//       }  
        
//       if(list2 == null){
//           return list1;
//       } 
        
//        if(list1.val > list2.val){       //swapping the heads 
//            ListNode temp = list1;
//            list1 = list2;
//            list2 = temp;
//        } 
        
//         ListNode res = list1;          //pointing result to list 1
       
//         while(list1!=null && list2!=null){
//             ListNode temp=null;
            
//             while(list1!=null && list1.val<=list2.val){
//                 temp = list1;
//                 list1=list1.next;
//             }
            
//             temp.next = list2;
            
//             //swapping again
//             ListNode tempi = list1;
//             list1=list2;
//             list2 =tempi;
   
//         }
        
//       return res;  
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();

        ListNode ans = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ans.next = l1;
                l1 = l1.next;
            } else {
                ans.next = l2;
                l2 = l2.next;
            }
            ans = ans.next;
        }
        
        if(l1!=null)
            ans.next = l1;
        if(l2!=null)
            ans.next=l2;
            

        // At least one of l1 and l2 can still have nodes at this point, so connect
        // the non-null list to the end of the merged list.

        return dummy.next;
    }
}

// class Solution {                                       //RECURSIVE APPROACH 
//     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         if (l1 == null) {
//             return l2;
//         }
//         else if (l2 == null) {
//             return l1;
//         }
//         else if (l1.val < l2.val) {
//             l1.next = mergeTwoLists(l1.next, l2);
//             return l1;
//         }
//         else {
//             l2.next = mergeTwoLists(l1, l2.next);
//             return l2;
//         }

//     }
// }