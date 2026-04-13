package LinkedList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        ListNode rev = null;
        while (temp != null) {
            ListNode newnode = temp.next; // save next node
            temp.next = rev;
            rev = temp;
            temp = newnode;
        }
        while (head != null && rev != null) {
            if (head.val != rev.val)
                return false;
            head = head.next;
            rev = rev.next;
        }
        return true;
    }
}

public class palindrome_LL {
    public static void main(String[] args) {

    }
}
