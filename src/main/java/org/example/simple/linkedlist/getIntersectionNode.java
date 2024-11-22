package org.example.simple.linkedlist;

import org.example.entity.ListNode;

public class getIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Initialize two pointers, a and b, to the head of the two linked lists
        ListNode a = headA;
        ListNode b = headB;
        // Loop until the two pointers are equal
        while (a != b) {
            // If a pointer reaches the end of its list,
            // move it to the head of the other list
            a = a == null ? headB : a.next;
            // If b pointer reaches the end of its list, move it to the head of the other list
            b = b == null ? headA : b.next;
        }
        // Return the intersection node
        return a;
    }

    public static void main(String[] args) {
        getIntersectionNode getIntersectionNode = new getIntersectionNode();

        // Test case 1: Intersection node exists
        ListNode headA1 = new ListNode(4);
        ListNode headB1 = new ListNode(5);
        ListNode intersectionNode1 = new ListNode(8);
        ListNode tail1 = new ListNode(4);
        headA1.next = new ListNode(1);
        headA1.next.next = new ListNode(8);
        headA1.next.next.next = tail1;
        headB1.next = new ListNode(0);
        headB1.next.next = new ListNode(1);
        headB1.next.next.next = intersectionNode1;
        intersectionNode1.next = tail1;
        assert getIntersectionNode.getIntersectionNode(headA1, headB1) == intersectionNode1;

        // Test case 2: Intersection node does not exist
        ListNode headA2 = new ListNode(2);
        ListNode headB2 = new ListNode(3);
        headA2.next = new ListNode(4);
        headB2.next = new ListNode(5);
        assert getIntersectionNode.getIntersectionNode(headA2, headB2) == null;

        // Test case 3: Both lists are empty
        ListNode headA3 = null;
        ListNode headB3 = null;
        assert getIntersectionNode.getIntersectionNode(headA3, headB3) == null;

        // Test case 4: One list is empty
        ListNode headA4 = new ListNode(2);
        ListNode headB4 = null;
        headA4.next = new ListNode(4);
        assert getIntersectionNode.getIntersectionNode(headA4, headB4) == null;

        // Test case 5: No intersection node, but lists have common nodes after intersection
        ListNode headA5 = new ListNode(2);
        ListNode headB5 = new ListNode(3);
        ListNode commonNode5 = new ListNode(4);
        headA5.next = new ListNode(4);
        headB5.next = new ListNode(5);
        headA5.next.next = commonNode5;
        headB5.next.next = commonNode5;
        assert getIntersectionNode.getIntersectionNode(headA5, headB5) == commonNode5;

        System.out.println("All test cases pass");
    }
}
