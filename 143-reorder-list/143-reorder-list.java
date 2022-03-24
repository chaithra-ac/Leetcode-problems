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
    
       ListNode temp;
        int s=0;
    public void reorderList(ListNode head) {
        temp=head;
         head=temp;
        ListNode size=head;
        while(size!=null){
            s++;
            size=size.next;
            
        }
        s=(s%2==0)?s:s-1;
        ListNode run=head;
        compute(run);
        
    }
    void compute(ListNode head){
        if(head==null)
            return;
        compute(head.next);
        if(s/2>0){
        ListNode node=temp.next;
        temp.next=head;
        temp=temp.next;
        temp.next=node;     
        temp=temp.next;
        s=s-2;
            // System.out.println(s+" "+temp.val+" "+node.val);
        }
        else temp.next=null;
    }
}