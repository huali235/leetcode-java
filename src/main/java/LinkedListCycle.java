// Definition for a singly-linked list
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        // Utilizing Floyd's Cycle Finding Algorithm
        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){
            if(fast == null || slow == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}