package org.example.simple;

import org.example.simple.entity.TreeNode;

public class isBalanced {

    // This method checks if a binary tree is balanced
    public boolean isBalanced(TreeNode root) {
        // If the root is null, the tree is balanced
        if (root == null) {
            return true;
        }
        // Check if the absolute difference between the heights of the
        // left and right subtrees is less than or equal to 1
        // and if both the left and right subtrees are balanced
        return Math.abs(
                height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    // This method returns the height of a binary tree
    public int height(TreeNode root) {
        // If the root is null, the height is 0
        if (root == null) {
            return 0;
        }
        // The height is the maximum height of the left and right subtrees plus 1
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static void main(String[] args) {
        isBalanced isBalanced = new isBalanced();
        System.out.println(isBalanced.isBalanced(new TreeNode(
                3, new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15), new TreeNode(7)))));
    }
}