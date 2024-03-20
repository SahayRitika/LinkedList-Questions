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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode currNode=list1,currNode2=list1;
        int c1=0,c2=0;
        while(c1<a-1){
            currNode=currNode.next;
            c1++;
        }
        while(c2<b+1){
            currNode2=currNode2.next;
            c2++;
        }
        currNode.next=list2;
        while(list2.next!=null){
            list2=list2.next;
        }
        list2.next=currNode2;
        return list1;
    }
}
