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
    public ListNode middleNode(ListNode head) {
        //Calculating size of the list
        int size=0;
        ListNode temp=head;
        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        int pos=size%2==0? size/2: size/2+1;
        int i=0;
        while(i!=pos){
            head=head.next;
            i++;
        }
        return head;
    }
}
