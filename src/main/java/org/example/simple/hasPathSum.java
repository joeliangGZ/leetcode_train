package org.example.simple;

import org.example.simple.entity.TreeNode;

public class hasPathSum {

    // This method checks if there is a path in the tree that sums up to the targetSum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // If the root is null, there is no path
        if (root == null) {
            return false;
        }

        // If the root is a leaf node and the value of the node is equal to the targetSum, return true
        if (root.left == null && root.right == null && root.val == targetSum) {
            return true;
        }

        // Recursively check the left and right subtrees with the updated targetSum
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String[] args) {

        hasPathSum hasPathSum = new hasPathSum();

        // Test case 1: Path exists
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);
        assert hasPathSum.hasPathSum(root1, 22);

        // Test case 2: Path does not exist
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(11);
        root2.left.left.left = new TreeNode(7);
        root2.left.left.right = new TreeNode(2);
        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(4);
        root2.right.right.right = new TreeNode(1);
        assert !hasPathSum.hasPathSum(root2, 23);

        // Test case 3: Empty tree
        TreeNode root3 = null;
        assert !hasPathSum.hasPathSum(root3, 0);

        // Test case 4: Single node tree with target sum
        TreeNode root4 = new TreeNode(5);
        assert hasPathSum.hasPathSum(root4, 5);

        // Test case 5: Single node tree without target sum
        TreeNode root5 = new TreeNode(5);
        assert !hasPathSum.hasPathSum(root5, 6);

        System.out.println("All test cases pass");
    }


}