package org.example.simple.tree;

import java.util.LinkedList;
import java.util.Queue;

public class isSymmetricBFS {

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

    // Function to check if a binary tree is symmetric
    public boolean isSymmetric(TreeNode root) {
        // If the root is null, the tree is symmetric
        if (root == null)
            return true;

        // Create a queue to store the nodes to be checked
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the left and right children of the root to the queue
        queue.add(root.left);
        queue.add(root.right);
        // While the queue is not empty
        while (!queue.isEmpty()) {
            // Get the left and right children of the current node
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            // If both children are null, continue to the next iteration
            if (left == null && right == null)
                continue;

            // If one of the children is null, the tree is not symmetric
            if (left == null || right == null)
                return false;

            // If the values of the children are not equal, the tree is not symmetric
            if (left.val != right.val)
                return false;

            // Add the left child of the left child and the right child of the right child to the queue
            queue.add(left.left);
            queue.add(right.right);
            // Add the right child of the left child and the left child of the right child to the queue
            queue.add(left.right);
            queue.add(right.left);
        }
        // If the queue is empty, the tree is symmetric
        return true;
    }

    public static void main(String[] args) {
        
        isSymmetricBFS solution = new isSymmetricBFS();

        // Test case 1: Symmetric tree
        isSymmetricBFS.TreeNode root1 = solution.new TreeNode(1);
        root1.left = solution.new TreeNode(2);
        root1.right = solution.new TreeNode(2);
        root1.left.left = solution.new TreeNode(3);
        root1.left.right = solution.new TreeNode(4);
        root1.right.left = solution.new TreeNode(4);
        root1.right.right = solution.new TreeNode(3);
        assert solution.isSymmetric(root1);

        // Test case 2: Non-symmetric tree
        isSymmetricBFS.TreeNode root2 = solution.new TreeNode(1);
        root2.left = solution.new TreeNode(2);
        root2.right = solution.new TreeNode(3);
        root2.left.left = solution.new TreeNode(4);
        root2.left.right = solution.new TreeNode(5);
        root2.right.left = solution.new TreeNode(6);
        root2.right.right = solution.new TreeNode(7);
        assert !solution.isSymmetric(root2);

        // Test case 3: Single node tree
        isSymmetricBFS.TreeNode root3 = solution.new TreeNode(1);
        assert solution.isSymmetric(root3);

        // Test case 4: Empty tree
        isSymmetricBFS.TreeNode root4 = null;
        assert solution.isSymmetric(root4);

        // Test case 5: Tree with two nodes
        isSymmetricBFS.TreeNode root5 = solution.new TreeNode(1);
        root5.left = solution.new TreeNode(2);
        root5.right = solution.new TreeNode(2);
        assert solution.isSymmetric(root5);

        System.out.println("All test cases pass");
    }

}