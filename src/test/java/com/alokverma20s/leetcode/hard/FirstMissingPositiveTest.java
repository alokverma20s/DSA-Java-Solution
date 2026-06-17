package com.alokverma20s.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {
    private final FirstMissingPositive firstMissingPositive;

    FirstMissingPositiveTest(){
        firstMissingPositive = new FirstMissingPositive();
    }

    @Test
    public void testFirstMissingPositive1() {
        int[] nums = new int[] {1};
        int expected = 2;
        int actual = firstMissingPositive.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstMissingPositive2() {
        int[] nums = new int[] {1,2,0};
        int expected = 3;
        int actual = firstMissingPositive.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstMissingPositive3() {
        int[] nums = new int[] {7,8,9,11,12};
        int expected = 1;
        int actual = firstMissingPositive.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstMissingPositive4() {
        int[] nums = new int[] {0,2,2,1,1};
        int expected = 3;
        int actual = firstMissingPositive.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstMissingPositive5() {
        int[] nums = new int[] {3,4,-1,1};
        int expected = 2;
        int actual = firstMissingPositive.firstMissingPositive(nums);
        assertEquals(expected, actual);
    }
}