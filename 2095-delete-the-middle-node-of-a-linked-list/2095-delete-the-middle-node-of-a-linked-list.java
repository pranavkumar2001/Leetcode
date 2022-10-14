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
    //there is a slight change in the process of finding middle of the node
    //in case of even number of nodes, we need to take (n/2)+1 th node as middle node
    //in case of even number of node,fast pointer will reach the second last node
    //in that case, we move the curr to curr.next
    public ListNode deleteMiddle(ListNode head) 
    {
        //edge case for single node
        if(head.next==null)
            return null;
        
        //edge case for 2 nodes
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        
        //flag variable to use in case of even number of nodes
        boolean flag=false;
        ListNode curr=head,prev=head,fast=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            prev=curr;
            curr=curr.next;
            fast=fast.next.next;
            
            //to check the case of even number of nodes
            if(fast.next!=null)
            {
                if(fast.next.next==null)
                    flag=true;
            }
        }
        
        //we move curr to curr.next
        if(flag)
        {
            prev=curr;
            curr=curr.next;
        }
        
        //the node deletion step
        prev.next=curr.next;
        
        return head;
    }
}