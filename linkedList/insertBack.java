public class insertBack {
    static class Node{
        int value;
        Node next;

        public Node(int val) {
            value = val;
            next = null;
        }
    }
    static class LinkedList {
        static Node head;
        public void insertBack(int value) {
            Node newNode = new Node(value);
            if(head == null) {
                head = newNode;
                return;
           }
           Node temp = head;
           while(temp.next != null) {
            temp = temp.next;
           }
           temp.next = newNode;
        }
        public void printList() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertBack(10);
        list.insertBack(20);
        list.insertBack(30);

        list.printList();
    }
}
/*
If k is zero, it means you want to insert the new node at the beginning of the list, 
effectively making it the new head. 

void insertAfterK(int value, int k) {
    Node newNode = new Node(value);
    if (k == 0) {
        newNode.next = head;
        head = newNode;
        return;
    }
    Node current = head;
    if (current == null) {
        head = newNode;
        return;
    }
    for (int i = 1; i < k; i++) {
        if(current == null){
            break;
        }
        current = current.next;
    }
    if(current != null){
        newNode.next = current.next;
        current.next = newNode;
    }
} */