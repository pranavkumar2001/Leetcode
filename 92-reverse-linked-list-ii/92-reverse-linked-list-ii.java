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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
       if(left==right)
           return head;
       ListNode prev=null,stprev=null,lfnd=null,fast,node=head,last=null;
       int pos=1;
       boolean run=true,flag=false;
       while(run)
       {
           fast=node.next;
           if(pos==left)
           {
               stprev=prev;
               lfnd=node;
               flag=true;
           }
           if(pos==right)
           {
               if(stprev!=null)
                   stprev.next=node;
               lfnd.next=node.next;
               run=false;
               last=node;
           }
           if(flag)
               node.next=prev;
           prev=node;
           node=fast;
           pos++;
       }
       if(stprev==null)
           head=last;
        return head;
    }
}