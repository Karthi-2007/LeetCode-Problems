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
    public ListNode partition(ListNode head, int x) {
        ListNode beforenode = new ListNode(0);
        ListNode afternode = new ListNode(0);

        ListNode before = beforenode;
        ListNode after = afternode;

        ListNode curr = head;
        while(curr != null){
            if(curr.val < x){
                before.next = curr;
                before = before.next;
            }else{
                after.next = curr;
                after = after.next;
            }
            curr = curr.next;
        }

        after.next = null;
        before.next = afternode.next;

        return beforenode.next;
    }
}