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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode start = dummy;
        while(start != null){

            int sum = 0;

            ListNode temp = start.next;
            while(temp != null){
                sum += temp.val;

                if(sum == 0){
                    start.next = temp.next;
                    break;
                }
                temp = temp.next;
            }
            if(temp == null){
                  start = start.next;
            }
           
        }
        return dummy.next;
    }
}