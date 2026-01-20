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
