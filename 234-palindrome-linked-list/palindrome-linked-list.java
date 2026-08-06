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
        ListNode curr = head;
        ListNode ncurr = head;

        Stack<Integer> stk = new Stack<Integer>();

        while(curr != null){
            stk.push(curr.val);
            curr = curr.next;
        }

        while(ncurr!=null){
            if(stk.pop() != ncurr.val){
                return false;
            }
            ncurr=ncurr.next;
        }

        return true;
    }
}