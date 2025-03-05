package org.example.tree;

import org.example.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public static void main(String[] args) {
        inorderTraversal traversal = new inorderTraversal();
        System.out.println(traversal.inorderTraversal(
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                new TreeNode(3), null))));
    }
}