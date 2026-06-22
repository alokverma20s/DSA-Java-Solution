package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {
    private final MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum();

    @Test
    void minimumSizeSubarraySumTest1(){
        int[] nums = new int[] {2,3,1,2,4,3};
        int target = 7;
        int expected = 2;
        int actual = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        assertEquals(expected, actual);
    }

    @Test
    void minimumSizeSubarraySumTest2(){
        int[] nums = new int[] {1,4,4};
        int target = 4;
        int expected = 1;
        int actual = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        assertEquals(expected, actual);
    }

    @Test
    void minimumSizeSubarraySumTest3(){
        int[] nums = new int[] {1,1,1,1,1,1,1,1};
        int target = 11;
        int expected = 0;
        int actual = minimumSizeSubarraySum.minSubArrayLen(target, nums);
        assertEquals(expected, actual);
    }
}
