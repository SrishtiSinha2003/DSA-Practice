class ListNode{
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class lengthOfLoop {
    public static int length(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return countLength(slow);
            }
        }
        return 0;
    }
    public static int countLength(ListNode slow) {
        ListNode temp = slow;
        int length = 1;

        while(temp.next != slow) {
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        // create nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        // connect nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // create loop (5 -> 3)
        fifth.next = third;

        int loopLength = length(head);

        System.out.println("Length of loop: " + loopLength);
        
    }
}
