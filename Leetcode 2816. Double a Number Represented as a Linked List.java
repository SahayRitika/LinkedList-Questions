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
    public ListNode doubleIt(ListNode head) {

        Stack<Integer> st= new Stack<>();
        int remainder=0,val;
        ListNode curr=reverse(head);

        while(curr!= null){
            val= curr.val *2+remainder;
            st.push(val%10);
            remainder= val/10;
            curr= curr.next;
        }

        if(remainder>0){
            st.push(remainder);
        }

        head= new ListNode(st.pop());
        curr= head;

        while(!st.isEmpty()){
            curr.next= new ListNode(st.pop());
            curr= curr.next;
        }
        
        return head;

    }

    public ListNode reverse(ListNode head){
        if(head== null|| head.next== null){
            return head;
        }

        ListNode prev= null, curr= head, nex= null;
        while(curr!= null){
            nex= curr.next;
            curr.next= prev;
            prev= curr;
            curr= nex;
        }

        return prev;
    }
}
