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
       ListNode temp=new ListNode(0);
        ListNode res=temp;
        while(head!=null){
            if(head.next==null||head.val!=head.next.val){
                temp.next=head;
                temp=temp.next;
            }
            else{
            System.out.print(head.next.val);

                while(head.val==head.next.val){
                  head=head.next;
                    if(head.next==null){
                        temp.next=null;
                        break;
                    }
            }
                System.out.print(head.val);
            }
            head=head.next;
        }
        return res.next;
    }
}