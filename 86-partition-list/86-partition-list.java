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
    public ListNode partition(ListNode head, int x) {
    ListNode dummyl=new ListNode(0);
    ListNode dummyg=new ListNode(0);
    ListNode great=dummyg;
    ListNode less=dummyl;
       while(head!=null){
           if(head.val<x){
               ListNode temp=head;
               head=head.next;
               temp.next=null;
               dummyl.next=temp;
               dummyl=dummyl.next;
           }
           else{
               ListNode temp=head;
               head=head.next;
               temp.next=null;
               dummyg.next=temp;
              dummyg=dummyg.next;
               }
           // head=head.next;
       }
        dummyl.next=great.next;
        return less.next;
    }
}