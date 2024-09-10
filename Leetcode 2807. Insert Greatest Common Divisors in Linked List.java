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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head== null || head.next==null){
            return head;
        }
        ListNode curr=head;
        while(curr.next!= null){
            int a= curr.val;
            int b= curr.next.val;
            while (b != 0) {
               int t = b;
               b = a % b;
               a = t;
            }
            ListNode node= new ListNode(a);
            
            ListNode temp= curr.next;
            curr.next= node;
            node.next= temp;
            curr= temp;
        }

        return head;
    }
}
