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
    int c,t;
    ListNode res;
    public ListNode middleNode(ListNode head) {
        if(head==null)return null;
           c++;
            middleNode(head.next);
            t++;
        if(c%2!=0&&c/2+1==t||c%2==0&&c/2==t)
            res=head;
        
      return res;  
    }
}