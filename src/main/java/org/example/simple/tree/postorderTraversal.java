package org.example.simple.tree;

import org.example.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class postorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        postOrder(node.left, result); // 遍历左子树
        postOrder(node.right, result); // 遍历右子树
        result.add(node.val); // 访问根节点
    }
}
