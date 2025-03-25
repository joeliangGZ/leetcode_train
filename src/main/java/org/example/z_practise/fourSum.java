package org.example.z_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        Arrays.sort(nums);

        // fast-return the impossible case
        if (nums[0] > 0 && target<0) return result;
        if (target>0 && nums[nums.length-1]<0) return result;

        for (int i = 0; i < nums.length-3; i++) {
            if (i >0 && nums[i]==nums[i-1]) continue;

            for (int j = i+1; j < nums.length-2; j++) {
                if (j>i+1 && nums[j] == nums[j-1]) continue;

                int left = j+1;
                int right = nums.length-1;

                while (left < right) {
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left<right && nums[left]==nums[left+1]) left++;
                        while (left<right && nums[right]==nums[right-1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
