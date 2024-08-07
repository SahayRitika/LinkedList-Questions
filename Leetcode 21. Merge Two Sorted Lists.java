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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1== null){
            return list2;
        }
        if(list2== null){
            return list1;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>();

        ListNode node= list1;
        while(node!= null){
            pq.add(node.val);
            node= node.next;
        }

        node= list2;
        while(node!= null){
            pq.add(node.val);
            node= node.next;
        }
        System.out.println(pq);
        ListNode head= new ListNode(pq.poll()); 
        ListNode curr=head;
        while(!pq.isEmpty()){
            ListNode temp= new ListNode(pq.poll()); 
            curr.next= temp;
            curr= curr.next;
        }
        
        return head;
    }
}
