package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTest1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumTest2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    void twoSumTest3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = twoSum.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }
}
