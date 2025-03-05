package org.example.linkedlist;

import org.example.entity.ListNode;

/**
 * @author lhh
 * @date 2024/11/19
 */
public class hasCycle {

    public boolean hasCycle(ListNode head) {
        // Initialize two pointers, slow and fast, to the head of the linked list
        ListNode slow = head, fast = head;
        // Loop through the linked list until the end is reached
        while (fast != null && fast.next != null) {
            // Move the slow pointer one step at a time
            slow = slow.next;
            // Move the fast pointer two steps at a time
            fast = fast.next.next;
            // If the slow and fast pointers meet, a cycle exists
            if (slow == fast) {
                return true;
            }
        }
        // If the end is reached without the pointers meeting, no cycle exists
        return false;
    }

    public static void main(String[] args) {
        hasCycle hasCycle = new hasCycle();
        System.out.println(hasCycle.hasCycle(new ListNode(1)));
    }
}
