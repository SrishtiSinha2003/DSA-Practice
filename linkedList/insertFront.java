public class insertFront {
    static class Node{
        int value;
        Node next;

        public Node(int val) {
            value = val;
            next = null;
        }
    }
    static class LinkedList {
        public Node head;
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
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        System.out.println(list.getHeadValue());
        list.insert(2);
        System.out.println(list.getHeadValue());
    }
}
