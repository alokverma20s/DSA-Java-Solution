package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayITest {
    private final MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();

    @Test
    void maximumAverageSubarrayITest1(){
        int[] nums = new int[] {1,12,-5,-6,50,3};
        int k = 4;
        double expected = 12.75000;
        double actual = maximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void maximumAverageSubarrayITest2(){
        int[] nums = new int[] {5};
        int k = 1;
        double expected = 5.00000;
        double actual = maximumAverageSubarrayI.findMaxAverage(nums, k);
        assertEquals(expected, actual);
    }

}
