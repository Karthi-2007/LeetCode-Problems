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
    public void reorderList(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
             fast = fast.next.next;
             slow = slow.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode pre = null;

        while(second != null){
            ListNode next = second.next;
            second.next = pre;
            pre = second;
            second = next;
        }

        second = pre;
        ListNode first = head;

        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}