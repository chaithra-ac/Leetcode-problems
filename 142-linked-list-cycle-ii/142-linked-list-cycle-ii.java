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
               if (head == null || head.next == null) return null; 
  
        ListNode slow = head, fast = head; 
  
        slow = slow.next; 
        fast = fast.next.next; 

        while (fast != null && fast.next != null)
        { 
            if (slow == fast) {
            ListNode slow2 = head; 
            while (slow2 != slow){
                slow = slow.next;
                slow2 = slow2.next;
            }
                return slow; 
            }
            slow = slow.next; 
            fast = fast.next.next; 
        
        }

        return null;
    }
}