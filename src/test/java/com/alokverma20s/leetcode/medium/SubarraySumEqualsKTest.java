package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {
    private final SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();

    @Test
    void subarraySumEqualsKTest1() {
        int[] nums = new int[] {1,1,1};
        int k = 2;
        int expected = 2;
        int actual = subarraySumEqualsK.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void subarraySumEqualsKTest2() {
        int[] nums = new int[] {1,2,3};
        int k = 3;
        int expected = 2;
        int actual = subarraySumEqualsK.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void subarraySumEqualsKTest3() {
        int[] nums = new int[] {1};
        int k = 0;
        int expected = 0;
        int actual = subarraySumEqualsK.subarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void subarraySumEqualsKTest4() {
        int[] nums = new int[] {-1, -1, 1};
        int k = 0;
        int expected = 1;
        int actual = subarraySumEqualsK.subarraySum(nums, k);
        assertEquals(expected, actual);
    }
}
