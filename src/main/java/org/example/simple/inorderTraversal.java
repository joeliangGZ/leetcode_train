package org.example.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {

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

    // Function to perform inorder traversal of a binary tree
    public List<Integer> inorderTraversal(TreeNode root) {
        // Create an empty list to store the values of the nodes
        List<Integer> list = new ArrayList<>();
        // If the root is null, return the empty list
        if (root == null) {
            return list;
        }
        // Create a stack to store the nodes
        Stack<TreeNode> stack = new Stack<>();
        // Start with the root node
        TreeNode node = root;
        // While the node is not null or the stack is not empty
        while (node != null || !stack.isEmpty()) {
            // While the node is not null
            while (node != null) {
                // Push the node onto the stack
                stack.push(node);
                // Move to the left child
                node = node.left;
            }
            // Pop the node from the stack
            node = stack.pop();
            // Add the value of the node to the list
            list.add(node.val);
            // Move to the right child
            node = node.right;
        }
        // Return the list of values
        return list;
    }

    public static void main(String[] args) {
        // Create an instance of the inorderTraversal class
        inorderTraversal traversal = new inorderTraversal();
        // Print the result of the inorder traversal of the tree
        System.out.println(traversal.inorderTraversal(
                traversal.new TreeNode(1,
                        null,
                        traversal.new TreeNode(2,
                                traversal.new TreeNode(3), null))));
    }
}