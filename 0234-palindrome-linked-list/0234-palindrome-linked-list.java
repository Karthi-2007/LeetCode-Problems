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
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = null;

        while(slow != null){
            ListNode Next = slow.next;
            slow.next = pre;
            pre = slow;
            slow = Next;
        }

        while(pre != null){
            if(head.val != pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        return true;
    }
}