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
        list.insert(3);
        // System.out.println(list.getHeadValue());
        list.insert(2);
        // System.out.println(list.getHeadValue());
        list.printList();
    }
}
/*
If k is greater than the list length
your code will throw a NullPointerException because you'll be trying to access current.next
 when current is null. You should add a check to ensure that 
k is within the valid range (1 to the list length) 
before iterating through the list. If k
is out of bounds, you might choose to either do nothing, 
insert at the end, or throw an exception, depending on the requirements of the problem. 
I am adding a condition to check whether the current pointer has become null. 
If it becomes null, it breaks out of the loop

void insertAfterK(int value, int k) {
    Node newNode = new Node(value);
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
