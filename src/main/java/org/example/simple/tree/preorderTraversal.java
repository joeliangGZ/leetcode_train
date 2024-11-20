package org.example.simple.tree;

import org.example.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class preorderTraversal {

    // 方法一：递归实现
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val); // 访问根节点
        preorder(node.left, result); // 遍历左子树
        preorder(node.right, result); // 遍历右子树
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        preorderTraversal preorderTraversal = new preorderTraversal();
        System.out.println(preorderTraversal.preorderTraversal(root));
    }
}
