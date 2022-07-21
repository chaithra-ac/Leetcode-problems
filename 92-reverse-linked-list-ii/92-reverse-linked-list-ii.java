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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      int i=0;
        while(head!=null){
            ++i;
            if(i==left){
               dummy.next=compute(head,i,right);
                break;
            }
            dummy.next=head;
            dummy=dummy.next;
            head=head.next;
        } 
       return res.next;
    }
    ListNode compute(ListNode head,int l,int r){
      ListNode prev=lastside(head,l,r);
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
            if(l==r)return prev; 
            ++l;
        }
        return prev;
    }
    ListNode lastside(ListNode head,int l,int r){
        while(head!=null){
            if(l==r)return head.next;  
            head=head.next;
             ++l;
        }
        return null;
    }
}