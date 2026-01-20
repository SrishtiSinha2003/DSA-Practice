public class criticalPoint {
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
            Node newnode = new Node(value);
            newnode.next = head;
            head = newnode;
        }
        public int getHead() {
            if(head == null) {
                return -1;
            } else {
                return head.value;
            }
        }
        public static int point(Node root) {
            if(root == null || root.next == null || root.next.next == null) {
                return 0;
            }
            int count = 0;
            Node prev = root;
            Node current = root.next;

            while(current.next != null) {
                Node next = current.next;

                if(current.value < prev.value && current.value < next.value) {
                    count++;
                } else if(current.value > prev.value && current.value > next.value) {
                    count++;
                }
                prev = current;
                current = next;
            }
        return count;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(2); 
        list.insert(3);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        System.out.println(LinkedList.point(list.head));
    }
}
