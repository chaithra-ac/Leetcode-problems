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
    ListNode dummy=new ListNode();
    ListNode res=dummy;
    int sum=0;
    public ListNode mergeNodes(ListNode head) {
        while(head!=null){
            if(head.val==0&&sum!=0){
                dummy.next=new ListNode(sum);
                dummy=dummy.next;
                sum=0;
            }
            else sum+=head.val;
            head=head.next;
        }
        return res.next;
    }
}