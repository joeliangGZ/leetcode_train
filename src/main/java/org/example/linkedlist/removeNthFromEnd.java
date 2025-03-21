package org.example.linkedlist;

import org.example.entity.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点 Middle
 */
public class removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;

        ListNode dummy = new ListNode(0);

        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // fast move n+1 keep n distance with slow
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, new ListNode(5, null)))));
        System.out.println(new removeNthFromEnd().removeNthFromEnd(listNode, 2));
    }
}
