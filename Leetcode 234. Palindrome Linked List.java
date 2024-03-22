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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        //Calculating size of list
        int size=0;
        ListNode currNode=head;
        while(currNode.next!=null){
            size++;
            currNode= currNode.next; 
        }
        size+=1;

        //place half of the list in stack
        Stack<Integer> st= new Stack<>();
        int count=0;
        currNode=head;
        while(count<(size/2)){
            st.push(currNode.val);
            currNode= currNode.next;
            count++;
        }
        // System.out.println(st);
        //comparing rest elemnts of list and stack 
        if(size%2!=0){
            currNode=currNode.next;
            count++;
        }
        while(!st.isEmpty() && count<size){
            Integer x= st.pop();
            // System.out.println(x+" "+currNode.val);
            if(x!=currNode.val){
                return false;
            }
            currNode=currNode.next;
            count++;

        }

        if(st.isEmpty() && count==size){
            return true;
        }
        else{
            return false;
        }

    }
}
