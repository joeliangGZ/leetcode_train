package org.example.recursion;

import org.example.entity.ListNode;

/**
 * 24. 两两交换链表中的节点 Middle
 */
public class swapPairs {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head.next;

        first.next = swapPairs(second.next);
        second.next = first;

        return second;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4, null))));
        ListNode swapped = new swapPairs().swapPairs(listNode);
        System.out.println(swapped);
    }
}
