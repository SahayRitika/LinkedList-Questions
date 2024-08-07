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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum= l1.val+  l2.val;
        int val= sum%10;
        int carry= sum/10;
        ListNode head= new ListNode(val);
        ListNode curr= head;
        l1=l1.next;
        l2=l2.next;

        while(l1!= null || l2!= null){
            sum=0;
            if(l1!=null){
                sum+= l1.val;
            }
            if(l2!=null){
                sum+= l2.val;
            }
            sum+= carry;
            val= sum%10;
            carry= sum/10;
            ListNode temp= new ListNode(val);
            curr.next= temp;
            curr=curr.next;
            if(l1!=null){
                l1= l1.next;
            }
            if(l2!=null){
                l2= l2.next;
            }
        }
        if(carry!=0){
            ListNode temp= new ListNode(carry);
            curr.next= temp;
        }

        return head;
    }
}
