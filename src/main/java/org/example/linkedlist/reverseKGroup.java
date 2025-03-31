package org.example.linkedlist;

import org.example.entity.ListNode;

public class reverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        // todo problemset 25
        while (k > 0) {
            ListNode first = head;
            ListNode second = head.next;

            second.next = first;
            first = second;
        }

        return null;
    }
}
