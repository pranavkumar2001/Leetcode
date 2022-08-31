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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        head=reverse(head);
        if(n==1)
            head=head.next;
        else
        {
             ListNode curr=head;
            int c=0;
            while(curr!=null)
            {
                c++;
                if(c+1==n)
                    curr.next=curr.next.next;
                curr=curr.next;
            }
        }
        head=reverse(head);
        return head;
    }
    
    public ListNode reverse(ListNode head)
    {
        if(head==null)
            return head;
        ListNode curr=head,fast=head,prev=null;
        while(fast!=null)
        {
            fast=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fast;
        }
        head=prev;
        return head;
    }
}