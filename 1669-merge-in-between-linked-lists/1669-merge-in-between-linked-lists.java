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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
    {
        boolean travel=true;
        ListNode temp=list1,prev=null,prevstor=null;
        int c=0;
        while(travel)
        {
            if(c==a)
                prevstor=prev;
            if(c==b)
               travel=false;
            prev=temp;
            temp=temp.next;
            c++;
        }
        //prev node of 'a' --> start of list2
        prevstor.next=list2;
        //moving to last of list2
        while(list2.next!=null)
            list2=list2.next;
        //last node of list2 --> next node of 'b'
        list2.next=temp;
        return list1;
    }
}