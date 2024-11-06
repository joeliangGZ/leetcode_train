package org.example.simple;

public class isSymmetricDFS {

    public static void main(String[] args) {
        isSymmetricDFS isSymmetricDFS = new isSymmetricDFS();
        TreeNode root = isSymmetricDFS.new TreeNode(1);
        root.left = isSymmetricDFS.new TreeNode(2);
        root.right = isSymmetricDFS.new TreeNode(2);
        root.left.left = isSymmetricDFS.new TreeNode(3);
        root.left.right = isSymmetricDFS.new TreeNode(4);
        root.right.left = isSymmetricDFS.new TreeNode(4);
        root.right.right = isSymmetricDFS.new TreeNode(3);
        System.out.println(isSymmetricDFS.isSymmetric(root));
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

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
