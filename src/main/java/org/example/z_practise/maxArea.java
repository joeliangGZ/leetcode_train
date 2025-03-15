package org.example.z_practise;

/**
 * @author lhh
 * @date 2025/3/15
 */
public class maxArea {

    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right) {

            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(currentArea, maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
