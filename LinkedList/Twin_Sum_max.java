package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Link {
    ListNode head = null;
    ListNode tail = null;

    public int pairSum() { // ListNode head access here (optional)
        if (head == null)
            return -1;
        int max = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        ListNode rev = null;
        while (temp != null) {
            ListNode newnode = temp.next; // next node save
            temp.next = rev;
            rev = temp;
            temp = newnode;
        }
        while (head != null && rev != null) {
            int sum = head.val + rev.val;
            max = Math.max(max, sum);
            head = head.next;
            rev = rev.next;
        }

        return max;
    }

    void add(int x) {
        ListNode newnode = new ListNode(x);
        if (head == null) {
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
    }

    void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}

public class Twin_Sum_max {
    public static void main(String[] args) {
        Link list = new Link();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(-3);
        System.out.println(list.pairSum());
    }
}
