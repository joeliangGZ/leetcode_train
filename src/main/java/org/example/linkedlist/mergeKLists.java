package org.example.linkedlist;

import org.example.entity.ListNode;

/**
 * 23. 合并 K 个升序链表 Hard
 */
public class mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        return mergeList(lists, 0, lists.length - 1);
    }

    private ListNode mergeList(ListNode[] lists, int lo, int hi) {

        if (lo == hi) return lists[lo];

        int mid = (lo + hi) / 2;

        ListNode left = mergeList(lists, lo, mid);
        ListNode right = mergeList(lists, mid + 1, hi);

        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        if (left != null) {
            current.next = left;
        }

        if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }
}
