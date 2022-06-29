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
        
       ListNode prev=null,prevstor=null,first=null,fast,node=head,last=null;
       int pos=1;
       boolean run=true,flag=false;
       //run to check if last has come or not
       //flag to check if first has come or not
       while(run)
       {
           fast=node.next;
           
           if(pos==left)
           {
               prevstor=prev;
               first=node;
               flag=true;
           }
           
           if(pos==right)
           {
               //point prev to first node to last node
               if(prevstor!=null) //to check if first is the starting node or not
                   prevstor.next=node;
               //point first node to next to last node.
               first.next=node.next;
               
               run=false;
               last=node;
           }
           
           //reversal part
           if(flag)
               node.next=prev;
           
           prev=node;
           node=fast;
           pos++;
       }
       //if starting node is first(pointer)
       if(prevstor==null)
           head=last;
        return head;
    }
}