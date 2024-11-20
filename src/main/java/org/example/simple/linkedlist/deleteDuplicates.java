package org.example.simple.linkedlist;

public class deleteDuplicates {

    // This method deletes duplicate values from a linked list
    public ListNode deleteDuplicates(ListNode head) {
        // If the head is null, return null
        if (head == null) {
            return null;
        }
        // Set the current node to the head
        ListNode cur = head;
        // Loop through the linked list
        while (cur.next != null) {
            // If the current node's value is equal to the next node's value
            if (cur.val == cur.next.val) {
                // Set the next node to the node after the next node
                cur.next = cur.next.next;
            } else {
                // Otherwise, set the current node to the next node
                cur = cur.next;
            }
        }
        // Return the head of the linked list
        return head;
    }

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}