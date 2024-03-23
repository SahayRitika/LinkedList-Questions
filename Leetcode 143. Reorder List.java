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
    public ListNode reverseList(ListNode head){
        ListNode curr=null;
        while(head!=null){
            ListNode temp=head;
            head=head.next;
            temp.next=curr;
            curr=temp;
        }
        // System.out.println(curr.val);
        return curr;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        mid=reverseList(mid);
        // System.out.println(mid.val);

        while(mid!=null){
            ListNode node1=head.next;
            ListNode node2=mid.next;

            head.next=mid;
            mid.next=node1;
            mid=node2;
            head=node1;
        }
    }
}
