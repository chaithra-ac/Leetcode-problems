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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null )return null;
    ListNode p = head;
    int len = 1;
    while(p.next != null) {
        p = p.next;
        len++;
    }
        
    if((k%len)== 0)
        return head;
        
    k %= len;
    k=len-k;
    len=0;
    p=head;
    ListNode res=p;
    while(len<k-1){
       p=p.next;len++; 
    }
       head=p.next;
       p.next=null;
        ListNode dummy=head;
    while(head.next!=null)
        head=head.next;
        head.next=res;
        
    return dummy;
}

    
}