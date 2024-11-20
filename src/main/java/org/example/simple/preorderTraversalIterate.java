package org.example.simple;

import org.example.simple.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversalIterate {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        List<TreeNode> stack = new ArrayList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.remove(stack.size() - 1);
            list.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        preorderTraversalIterate preorderTraversal = new preorderTraversalIterate();
        System.out.println(preorderTraversal.preorderTraversal(root));
    }
}
