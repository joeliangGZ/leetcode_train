package org.example.simple.tree;

import org.example.entity.TreeNode;

/**
 * @author lhh
 * @date 2024/11/12
 */
public class minDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (root.left == null || root.right == null) {
            return left + right + 1;
        }
        return Math.min(left, right) + 1;
    }

    public static void main(String[] args) {

        minDepth minDepth = new minDepth();

        // Test case 1: Tree with only one node
        TreeNode root1 = new TreeNode(1);
        assert minDepth.minDepth(root1) == 1;

        // Test case 2: Tree with two nodes
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        assert minDepth.minDepth(root2) == 2;

        // Test case 3: Tree with three nodes
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        assert minDepth.minDepth(root3) == 2;

        // Test case 4: Tree with four nodes
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        assert minDepth.minDepth(root4) == 3;

        // Test case 5: Tree with five nodes
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.left = new TreeNode(4);
        root5.left.right = new TreeNode(5);
        assert minDepth.minDepth(root5) == 3;

        // Test case 6: Tree with unbalanced structure
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.left.left = new TreeNode(3);
        root6.left.left.left = new TreeNode(4);
        assert minDepth.minDepth(root6) == 4;

        // Test case 7: Tree with all nodes at the same level
        TreeNode root7 = new TreeNode(1);
        root7.left = new TreeNode(2);
        root7.right = new TreeNode(3);
        root7.left.left = new TreeNode(4);
        root7.left.right = new TreeNode(5);
        root7.right.left = new TreeNode(6);
        root7.right.right = new TreeNode(7);
        assert minDepth.minDepth(root7) == 3;

        System.out.println("All test cases pass");
    }


}
