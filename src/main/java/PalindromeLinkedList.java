/*
Given the head of a singly linked list, return true if it is a
palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true
 */

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        // Find the middle point of the Linked List
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode last = null;
        ListNode current = slow;

        // Iterate through the second half of List
        while(current != null){
            ListNode newNode = current.next;
            current.next = last;
            last = current;
            current = newNode;
        }
        ListNode secondHalf = last;

        ListNode firstHalf = head;
        // Check if the values of the second half equal the values of the first half
        while(secondHalf != null){
            if(firstHalf.val != secondHalf.val){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
}