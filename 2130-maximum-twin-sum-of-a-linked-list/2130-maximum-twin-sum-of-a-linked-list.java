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
    public int pairSum(ListNode head) 
    {
       ListNode prev,slow=head,fast=head;
       while(fast.next!=null && fast.next.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
       }
       prev=slow;
       fast=slow.next;
       prev.next=null;
       //System.out.print(fast.val+" ");
       ListNode temp=null,dummy=null;
        while(fast!=null)
        {
           temp=fast.next;
           fast.next=dummy;
           dummy=fast;
           fast=temp;
        }
       slow=head;fast=dummy;
       int max=Integer.MIN_VALUE;
       while(fast!=null)
       {
           max=Math.max(max,fast.val+slow.val);
           fast=fast.next;
           slow=slow.next;
       }
        return max;
    }
}