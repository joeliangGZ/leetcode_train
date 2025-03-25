package org.example.z_practise;

import org.example.entity.ListNode;

public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null && n > 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n+1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
