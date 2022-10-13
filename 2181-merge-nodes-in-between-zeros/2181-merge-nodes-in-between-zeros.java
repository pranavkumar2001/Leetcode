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
    public ListNode mergeNodes(ListNode head) 
    {
        boolean flag=true;
        ListNode prev=null,newhead=null,temp=null;
        while(head!=null)
        {
           //create new node except for last;
           if(head.val==0 && head.next!=null)
           {
               temp=new ListNode(0);
               
               //assign next of prev to current node
               if(prev!=null)
                prev.next=temp;
               
               //store current to prev
               prev=temp;
               
           }
           
           //store the head of list
           if(flag)
           {
               newhead=temp;
               flag=false;
           }
            
           temp.val+=head.val;
           head=head.next;
        }
         return newhead;
    }
}