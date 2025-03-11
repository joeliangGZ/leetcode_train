package org.example.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 4.寻找两个有序数组的中位数 Hard
 */
public class findMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> sortedArray = Stream
                .concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed())
                .sorted().collect(Collectors.toList());

        int size = sortedArray.size();
        if (size % 2 == 1) {
            return sortedArray.get(size / 2);
        } else {
            return (sortedArray.get(size / 2 - 1) + sortedArray.get(size / 2)) / 2.0;
        }

    }
}
