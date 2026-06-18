package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TwoSum2Test {
    private final TwoSum2 twoSum2 = new TwoSum2();

    @Test
    void twoSumTest1() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {1, 2};
        int[] actual = twoSum2.twoSum(nums, target);
        assertArrayEquals(expected, actual);

    }

    @Test
    void twoSumTest2() {
        int[] nums = new int[] {2,3,4};
        int target = 6;
        int[] expected = new int[] {1, 3};
        int[] actual = twoSum2.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void twoSumTest3() {
        int[] nums = new int[] {-1,0};
        int target = -1;
        int[] expected = new int[] {1, 2};
        int[] actual = twoSum2.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}
