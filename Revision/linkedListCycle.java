class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class linkedListCycle {
    public static ListNode cycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return null;
        while(head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
/*
public static boolean hasCycle(ListNode head) {
ListNode fast = head;
ListNode slow = head;
while(fast!=null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
if(slow == fast) return true else false
}
}

 */
