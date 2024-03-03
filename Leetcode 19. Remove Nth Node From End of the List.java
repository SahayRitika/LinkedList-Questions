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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null|| head.next==null && n==1){
            return null;
        }
        //Calculating size of the list
        ListNode temp=head;int size=0;
        while(temp.next!=null){
           size++;
           temp=temp.next;
        }
        size+=1;
        if(size==n){
            return (head.next);
        }
        temp=head;
        int pos=size-n-1,i=0;
        while(i!=pos){
            temp=temp.next;i++;
            // System.out.println(pos+" "+i);
        }
        temp.next=temp.next.next;
        return head;
    }
}
