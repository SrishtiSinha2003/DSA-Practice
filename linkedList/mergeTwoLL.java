import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class mergeTwoLL {

    // Function to merge two sorted linked lists
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    // Function to create a linked list from user input
    public static ListNode createList(Scanner sc) {
        ListNode head = null, tail = null;

        System.out.println("Enter elements (-1 to stop):");
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;

            ListNode newNode = new ListNode(x);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Function to print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create first sorted linked list:");
        ListNode l1 = createList(sc);

        System.out.println("Create second sorted linked list:");
        ListNode l2 = createList(sc);

        mergeTwoLL obj = new mergeTwoLL();
        ListNode merged = obj.mergeTwoLists(l1, l2);

        System.out.println("Merged Linked List:");
        printList(merged);

        sc.close();
    }
}
