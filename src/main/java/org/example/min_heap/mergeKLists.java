package org.example.min_heap;

import org.example.entity.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. 合并 K 个升序链表 Hard
 */
public class mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        // add headNode for each list
        for (ListNode head : lists) {
            if (head != null) {
                heap.add(head);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // fetch headNode and add next to sort
        while (!heap.isEmpty()) {
            ListNode curr = heap.poll();

            tail.next = curr;
            tail = tail.next;

            if (curr.next != null) {
                curr = curr.next;
                heap.add(curr);
            }
        }

        return dummy.next;
    }
}
