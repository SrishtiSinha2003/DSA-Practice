public class kthposition {
    static class Node{
        int value;
        Node next;

        public Node(int val) {
            value = val;
            next = null;
        }
    }

    static class LinkedList {
    Node head;
    public void insert(int value) {
            System.out.println("Inserting " + value);
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }
        public int getHeadValue(){
            if(head == null) {
                return -1;
            } else {
                return head.value;
            }
        }
    public void insertAtK(int val, int k) {
    Node newnode = new Node(val);

    // Case 1: insert at head (k = 1)
    if (k == 1) {
        newnode.next = head;
        head = newnode;
        return;
    }
    Node current = head;

    // Move to (k-1)th node
    for (int i = 1; i < k - 1 && current != null; i++) {
        current = current.next;
    }
    // If k is invalid (greater than list length + 1)
    if (current == null) {
        System.out.println("Invalid position");
        return;
    }

    // Insert node
    newnode.next = current.next;
    current.next = newnode;
}
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // Initial list
    list.insert(10);
    list.insert(20);
    list.insert(40);

    System.out.print("Before insertion: ");
    list.printList();

    // Insert 30 at position k = 3
    int k = 3;
    list.insertAtK(30, k);

    System.out.print("After insertion at position " + k + ": ");
    list.printList();
    }
}
