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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode t1=reverse(l1);
        ListNode t2=reverse(l2);
        int carry=0;
        ListNode ans=null,head=null;
        while(t1!=null || t2!=null || carry>0)
        {
            ListNode temp=new ListNode(0);
            int v=0;
            if(t1!=null && t2!=null)
              v=t1.val+t2.val+carry;
            else if(t1!=null)
              v=t1.val+carry;
            else if(t2!=null)
              v=t2.val+carry;
            else if(carry>0)
              v=carry;
            temp.val=v%10;
            carry=v/10;
            if(ans!=null)
            {
                ans.next=temp;
                ans=ans.next;
            }
            else
            {
                ans=temp;
                head=temp;
            }
            if(t1!=null)
             t1=t1.next;
            if(t2!=null)
             t2=t2.next;
        }

        return reverse(head);
    }
    
    public ListNode reverse(ListNode head)
    {
        if(head==null)
            return head;
        ListNode fast,prev=null,temp=head;
        while(temp!=null)
        {
            fast=temp.next;
            temp.next=prev;
            prev=temp;
            temp=fast;
        }
        return prev;
    }
}