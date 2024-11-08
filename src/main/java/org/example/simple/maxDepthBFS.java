package org.example.simple;

import java.util.LinkedList;
import java.util.Queue;

public class maxDepthBFS {

    public static void main(String[] args) {
        maxDepthBFS maxDepthDFS = new maxDepthBFS();
        TreeNode root = maxDepthDFS.new TreeNode(3);
        root.left = maxDepthDFS.new TreeNode(9);
        root.right = maxDepthDFS.new TreeNode(20);
        root.right.left = maxDepthDFS.new TreeNode(15);
        root.right.right = maxDepthDFS.new TreeNode(7);
        System.out.println(maxDepthDFS.maxDepth(root));
    }

    // 将每一层的所有子节点加入队列，然后 depth+1
    // This method uses BFS to find the maximum depth of a binary tree
    public int maxDepth(TreeNode root) {
        // If the root is null, return 0
        if (root == null) {
            return 0;
        }
        // Create a queue to store the nodes
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the root node to the queue
        queue.offer(root);
        // Initialize the depth to 0
        int depth = 0;
        // While the queue is not empty
        while (!queue.isEmpty()) {
            // Get the size of the queue
            int size = queue.size();
            // For each node in the queue
            for (int i = 0; i < size; i++) {
                // Get the node
                TreeNode node = queue.poll();
                // If the node has a left child, add it to the queue
                if (node.left != null) {
                    queue.offer(node.left);
                }
                // If the node has a right child, add it to the queue
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            // Increment the depth
            depth++;
        }
        // Return the depth
        return depth;
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