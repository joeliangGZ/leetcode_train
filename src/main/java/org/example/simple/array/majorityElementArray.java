package org.example.simple.array;

import java.util.Arrays;

public class majorityElementArray {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
