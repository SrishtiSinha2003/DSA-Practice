import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class removeDuplicates {

    // Remove duplicates from sorted linked list
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next; // skip duplicate
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // Create linked list from user input
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

    // Print linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create sorted linked list:");
        ListNode head = createList(sc);

        removeDuplicates obj = new removeDuplicates();
        head = obj.deleteDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printList(head);

        sc.close();
    }
}
