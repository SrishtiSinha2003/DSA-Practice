public class headLL {
    static class Node {
        int value;
        Node next;

        Node(int val) {
            value = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        System.out.println(head.value);
    }
}
