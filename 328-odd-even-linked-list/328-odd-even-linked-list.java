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
    public ListNode oddEvenList(ListNode head) 
    {
        if(head==null || head.next==null)
            return head;
        
        //create dummy first and second node
        ListNode esenti=new ListNode(0,head);
        ListNode osenti=new ListNode(99,esenti);
        
        ListNode odd=osenti,even=esenti,temp=head;
        int count=0;
        
        while(temp!=null)
        {
            count++;
            if(count%2==1)
            {
               odd.next=temp; 
               odd=odd.next;
            }
            else
            {
                even.next=temp;
                even=even.next;
            }
            temp=temp.next;
        }
        
        //point last even numbered node to null
        even.next=null;
        
        //esenti.next is the first real even numbered node
        //we are pointing last odd numbered node to first even numbered node
        odd.next=esenti.next;
        
        //we are actually returning head
        return osenti.next;
    }
}