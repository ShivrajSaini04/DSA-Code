package LinkedList;

public class Add_Two_Number {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode tail = null;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int num = sum % 10;
            carry = sum / 10;
            ListNode newnode = new ListNode(num);
            if (head == null)
                head = tail = newnode;
            else {
                tail.next = newnode;
                tail = newnode;
            }

        }
        return head;
    }
}