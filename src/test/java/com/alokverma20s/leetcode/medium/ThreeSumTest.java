package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {
    private final ThreeSum threeSum = new ThreeSum();

    @Test
    void threeSumTest() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void threeSumTest2() {
        int[] nums = {0,1,1};
        List<List<Integer>> expected = List.of();
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void threeSumTest3() {
        int[] nums = {0,0,0};
        List<List<Integer>> expected = List.of(List.of(0,0,0));
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void threeSumTest4() {
        int[] nums = {1,2,0,1,0,0,0,0};
        List<List<Integer>> expected = List.of(List.of(0,0,0));
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(expected, actual);
    }

    @Test
    void threeSumTest5() {
        int[] nums = {-100,-70,-60,110,120,130,160};
        List<List<Integer>> expected = List.of(List.of(-100,-60,160), List.of(-70,-60,130));
        List<List<Integer>> actual = threeSum.threeSum(nums);
        assertEquals(expected, actual);
    }
}
