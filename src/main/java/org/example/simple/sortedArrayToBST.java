package org.example.simple;

import org.example.simple.entity.TreeNode;

import java.util.List;

public class sortedArrayToBST {

    public static void main(String[] args) {
        sortedArrayToBST sortedArrayToBST = new sortedArrayToBST();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        int[] nums = {1, 2, 2, 3, null, null, 3, 4, null, null, 4};
        TreeNode root = sortedArrayToBST.sortedArrayToBST(nums);

        inorderTraversal traversal = new inorderTraversal();
        List<Integer> inorderTraversal = traversal.inorderTraversal(root);
        System.out.println(root);
        System.out.println(inorderTraversal);
    }

    // This method takes an array of integers and returns a binary search tree
    public TreeNode sortedArrayToBST(int[] nums) {
        // Call the helper method with the array, starting index and ending index
        return helper(nums, 0, nums.length - 1);
    }

    // This method takes an array of integers, starting index and ending index and returns a binary search tree
    private TreeNode helper(int[] nums, int i, int i1) {
        // If the starting index is greater than the ending index, return null
        if (i > i1) {
            return null;
        }
        // Calculate the middle index
        int mid = (i + i1) / 2;
        // Create a new TreeNode with the value at the middle index
        TreeNode root = new TreeNode(nums[mid]);
        // Recursively call the helper method with the left half of the array
        root.left = helper(nums, i, mid - 1);
        // Recursively call the helper method with the right half of the array
        root.right = helper(nums, mid + 1, i1);
        // Return the root node
        return root;
    }
    /*
    Time Complexity: O(n)
    Space Complexity: O(log n)
     */
}