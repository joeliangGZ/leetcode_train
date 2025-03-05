package org.example.tree;

import org.example.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversalIterate {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left; // 先遍历左子树
            }
            current = stack.pop();
            result.add(current.val); // 访问根节点
            current = current.right; // 遍历右子树
        }

        return result;
    }

    public static void main(String[] args) {
        // Create an instance of the inorderTraversal class
        inorderTraversalIterate traversal = new inorderTraversalIterate();
        // Print the result of the inorder traversal of the tree
        System.out.println(traversal.inorderTraversal(
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                new TreeNode(3), null))));
    }
}