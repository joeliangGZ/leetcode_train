package org.example.simple.tree;

import java.util.LinkedList;
import java.util.Queue;

public class isSameTreeBFS {

    public static void main(String[] args) {
        // Create an instance of the isSameTree class
        isSameTreeBFS isSameTree_DFS = new isSameTreeBFS();
        // Create two trees with the same structure and values
        TreeNode p = isSameTree_DFS.new TreeNode(1, isSameTree_DFS.new TreeNode(2), isSameTree_DFS.new TreeNode(3));
        TreeNode q = isSameTree_DFS.new TreeNode(1, isSameTree_DFS.new TreeNode(2), isSameTree_DFS.new TreeNode(3));
        // Print the result of the isSameTree method
        System.out.println(isSameTree_DFS.isSameTree(p, q));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are null, they are the same
        if (p == null && q == null) {
            return true;
        // If one of the trees is null, they are not the same
        } else if (p == null || q == null) {
            return false;
        }
        // Create two queues to store the nodes of the trees
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        // Add the root nodes of the trees to the queues
        queue1.offer(p);
        queue2.offer(q);
        // Loop through the queues until they are empty
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            // Get the next nodes from the queues
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();
            // If the values of the nodes are not the same, the trees are not the same
            if (node1.val != node2.val) {
                return false;
            }
            // Get the left and right children of the nodes
            TreeNode left1 = node1.left, right1 = node1.right;
            TreeNode left2 = node2.left, right2 = node2.right;
            // If the left children are not the same, the trees are not the same
            if ((left1 == null) ^ (left2 == null)) {
                return false;
            }
            // If the right children are not the same, the trees are not the same
            if ((right1 == null) ^ (right2 == null)) {
                return false;
            }
            // If the left children are not null, add them to the queues
            if (left1 != null) {
                queue1.offer(left1);
                queue2.offer(left2);
            }
            // If the right children are not null, add them to the queues
            if (right1 != null) {
                queue1.offer(right1);
                queue2.offer(right2);
            }
        }
        // If the queues are empty, the trees are the same
        return queue1.isEmpty() && queue2.isEmpty();
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}