package org.example.simple.tree;

public class maxDepthDFS {

    public static void main(String[] args) {
        maxDepthDFS maxDepthDFS = new maxDepthDFS();
        TreeNode root = maxDepthDFS.new TreeNode(3);
        root.left = maxDepthDFS.new TreeNode(9);
        root.right = maxDepthDFS.new TreeNode(20);
        root.right.left = maxDepthDFS.new TreeNode(15);
        root.right.right = maxDepthDFS.new TreeNode(7);
        System.out.println(maxDepthDFS.maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
