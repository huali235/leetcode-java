class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectTwoLinkLists {
    public static void main(String [] args){
    }

    private int getLength(ListNode head){
        int length = 0;
        while(head != null){
            length++;
            head = head.next;
        }
        return length;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lengthA = getLength(headA);
        int lengthB = getLength(headB);

        while(lengthA > lengthB){
            headA = headA.next;
            lengthA--;
        }

        while(lengthB > lengthA){
            headB = headB.next;
            lengthB--;
        }

        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}