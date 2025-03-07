package org.example.z_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class findMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> integers = Stream.concat(Arrays.stream(nums1).boxed(),
                        Arrays.stream(nums2).boxed())
                .sorted().toList();

        int size = integers.size();
        if (size % 2 == 0) {
            return (integers.get(size / 2) + integers.get(size / 2 - 1)) / 2.0;
        } else {
            return integers.get(size / 2);
        }

    }
}
