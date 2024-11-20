package org.example.simple.tree;

import org.example.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversalIterate {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode lastVisited = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left; // 先遍历左子树
            }
            current = stack.peek();
            if (current.right == null || current.right == lastVisited) {
                result.add(current.val); // 访问根节点
                stack.pop();
                lastVisited = current;
                current = null; // 继续处理下一个节点
            } else {
                current = current.right; // 遍历右子树
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.right = node2;
        node2.left = node3;
        postorderTraversalIterate postorderTraversalIterate = new postorderTraversalIterate();
        List<Integer> result = postorderTraversalIterate.postorderTraversal(root);
        System.out.println(result); // 输出 [3, 2, 1]
    }

}
