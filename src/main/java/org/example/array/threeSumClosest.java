package org.example.array;

import java.util.Arrays;

/**
 * 16. 最接近的三数之和 Middle
 *
 * @author lhh
 * @date 2025/3/18
 */
public class threeSumClosest {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else if (currentSum > target) {
                    right--;
                } else {
                    return currentSum;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] ints = {4, 0, 5, -5, 3, 3, 0, -4, -5};
        int target = -2;
        System.out.println(new threeSumClosest().threeSumClosest(ints, target));
    }
}
