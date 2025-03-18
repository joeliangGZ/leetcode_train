package org.example.z_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lhh
 * @date 2025/3/18
 */
public class threeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }

        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip the first same num
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    results.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip the after same num
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return results;
    }
}
