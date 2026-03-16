class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class removeNthNode {
    public static ListNode remove(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0; i<n; i++) fast = fast.next;
        if (fast == null) return head.next;
        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

     // function to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int n = 2;

        // create linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        head = remove(head, n);

        System.out.print("After Removing " + n + "th Node From End: ");
        printList(head);
    }
}