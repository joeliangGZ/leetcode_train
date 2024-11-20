package org.example.simple.array;

public class removeDuplicates {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        removeDuplicates rd = new removeDuplicates();
        int[] nums = {1,1,2};
        System.out.println(rd.removeDuplicates(nums));

        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(rd.removeDuplicates(nums1));

        // 如果是移除非严格递增排列的数组，使用LinkedHashSet去重并保留元素相对位置

    }
}
