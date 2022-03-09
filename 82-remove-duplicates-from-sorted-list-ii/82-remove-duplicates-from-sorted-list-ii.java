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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dup=null;
        ListNode dummy=new ListNode();
        dummy.next=head;
        // System.out.print(dummy.val);
        ListNode res=dummy;
        while(dummy!=null&&dummy.next!=null&&dummy.next.next!=null){
            if(dummy.next.val==dummy.next.next.val){
              dup=howfar(dummy.next,dummy.next.val);
                while(dup!=null&&dup.next!=null&&dup.val==dup.next.val)
                  dup=howfar(dup,dup.val);
                dummy.next=dup;
                dummy=dup;
                // System.out.print(dummy.val+" ");
            }
            else
                dummy=dummy.next;

                 // System.out.println(dummy.val+" ");
        }
        return res.next;
    }
    ListNode howfar(ListNode dup,int cur){
        while(dup!=null&&dup.val==cur)
            dup=dup.next;
        return dup;
    }
}