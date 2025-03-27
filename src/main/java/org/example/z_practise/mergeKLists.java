package org.example.z_practise;

import org.example.entity.ListNode;

public class mergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) return null;

        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int lo, int hi) {
        if (lo == hi) return lists[lo];

        int mid = lo + (hi - lo) / 2;

        ListNode left = merge(lists, lo, mid);
        ListNode right = merge(lists, mid + 1, hi);

        return doMerge(left, right);
    }

    private ListNode doMerge(ListNode left, ListNode right) {

        if (left == null) return right;
        if (right == null) return left;

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
