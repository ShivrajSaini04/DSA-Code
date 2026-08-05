package LinkedList;

public class reverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode rev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = rev;
            rev = temp;
            temp = next;
        }
        return rev;
    }
    
}