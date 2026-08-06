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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stk= new Stack<>();

        ListNode curr = head;
        while(curr!= null){
            stk.push(curr.val);
            curr= curr.next;
        }
        ListNode nod = head;
        while(!stk.isEmpty()){
            nod.val = stk.pop();
            nod= nod.next;
        }
        return head;
    }
}