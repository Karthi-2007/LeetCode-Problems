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
    public ListNode merge(ListNode list1, ListNode list2){

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list1;
        }

        if(list1.val < list2.val){
            list1.next = merge(list1.next, list2);
            return list1;
        }else{
            list2.next = merge(list1, list2.next);
            return list2;
        }
    }
    public ListNode split(ListNode[] lists, int start, int end){

        if(start == end){
            return lists[start];
        }

        int mid = start + (end - start) / 2;

        ListNode list1 = split(lists, start, mid);
        ListNode list2 = split(lists, mid+1, end);

        return merge(list1, list2);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length == 0){
            return null;
        }

        return split(lists, 0, lists.length - 1);
    }
}