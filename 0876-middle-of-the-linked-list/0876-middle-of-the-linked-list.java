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
    public ListNode middleNode(ListNode head) {
       
        ListNode slow = head;
        ListNode high = head;
        
        while(high != null && high.next != null){
            slow = slow.next;
            high = high.next.next;
        }
       return slow;
    }
}