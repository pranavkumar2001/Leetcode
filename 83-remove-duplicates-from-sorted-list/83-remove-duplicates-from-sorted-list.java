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
    public ListNode deleteDuplicates(ListNode head) 
    {
        if(head==null||head.next==null)
	  return head;
	 ListNode node=head.next,prev=head;
	 while(node!=null)
	 {
	    while(node!=null && node.val==prev.val) 
	    {
	        prev.next=node.next;
	        node=node.next;
	    }
	    prev=prev.next;
	    if(node!=null)
	    node=node.next;
	 }
	 return head;
    }
}