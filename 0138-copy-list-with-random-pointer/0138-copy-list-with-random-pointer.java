/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Map<Node,Node> m = new HashMap<>();
        if(head == null) return null;

        Node curr = head;
        while(curr != null){
            m.put(curr , new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            m.get(curr).next = m.get(curr.next);
            m.get(curr).random = m.get(curr.random);
            curr = curr.next;
        }
        return m.get(head);
    }
}