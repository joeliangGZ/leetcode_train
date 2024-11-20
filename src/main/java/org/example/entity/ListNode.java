package org.example.entity;

/**
 * @author lhh
 * @date 2024/11/19
 */
// Definition for singly-linked list.
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
