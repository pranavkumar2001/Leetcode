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
        even.next=null;
        odd.next=esenti.next;
        System.out.println(even.val+" "+esenti.next.val);
        return osenti.next;
    }
}