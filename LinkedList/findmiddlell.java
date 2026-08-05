package LinkedList;

public class findmiddlell {
    
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head; // base case
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
