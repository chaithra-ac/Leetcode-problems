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
    ListNode dummy=new ListNode(0);
    ListNode res=dummy;
    public ListNode mergeNodes(ListNode head) {
      head=head.next;
     while(head!=null){
         if(head.next==null)return res;
         if(head.val==0){
             dummy.next=new ListNode(0);
             dummy=dummy.next;
         }
         else
         dummy.val+=head.val;
         head=head.next;
     }
        return null;
    }
}