package org.example.tree;

public class isSameTreeDFS {

    public static void main(String[] args) {
        // Create an instance of the isSameTree class
        isSameTreeDFS isSameTreeDFS = new isSameTreeDFS();
        // Create two trees with the same structure and values
        TreeNode p = isSameTreeDFS.new TreeNode(1, isSameTreeDFS.new TreeNode(2), isSameTreeDFS.new TreeNode(3));
        TreeNode q = isSameTreeDFS.new TreeNode(1, isSameTreeDFS.new TreeNode(2), isSameTreeDFS.new TreeNode(3));
        // Print the result of the isSameTree method
        System.out.println(isSameTreeDFS.isSameTree(p, q));
    }

    // Method to check if two trees are the same
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // If both trees are null, they are the same
        if (p == null && q == null) {
            return true;
        }
        // If one of the trees is null, they are not the same
        if (p == null || q == null) {
            return false;
        }
        // If the values of the nodes are not the same, they are not the same
        if (p.val != q.val) {
            return false;
        }
        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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