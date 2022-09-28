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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        
        int size=0;
        
        while(temp!=null){
            ++size;
            temp=temp.next;
        }
        
        n=size-n+1;
        if(n==1)return head.next;
        temp=head;
        head=temp;
        
        while(temp!=null){
            --n;
            if(n==1)
                temp.next=temp.next.next;
            
            temp=temp.next;
        }
        
    return head;
    }
}