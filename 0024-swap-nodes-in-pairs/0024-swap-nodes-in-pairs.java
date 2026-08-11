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
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;

        for(int i = 0;i < 2; i++){
            if(temp == null){
                return head;
            }
            temp = temp.next;
        }

        ListNode pre = null;
        ListNode cur = head;
        
        for(int i = 0;i < 2; i++){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        head.next = swapPairs(cur);

        return pre;
    }
}