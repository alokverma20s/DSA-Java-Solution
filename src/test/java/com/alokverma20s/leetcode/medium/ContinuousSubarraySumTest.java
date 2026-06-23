package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContinuousSubarraySumTest {
    private final ContinuousSubarraySum continuousSubarraySum= new ContinuousSubarraySum();

    @Test
    void continuousSubarraySumTest1(){
        int[] nums = new int[] {23,2,4,6,7};
        int k = 6;
        boolean expected = true;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest2(){
        int[] nums = new int[] {23,2,6,4,7};
        int k = 13;
        boolean expected = false;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest3(){
        int[] nums = new int[] {23,2,6,4,7};
        int k = 6;
        boolean expected = true;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest4(){
        int[] nums = new int[] {5,0,0,0};
        int k = 3;
        boolean expected = true;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest5(){
        int[] nums = new int[]{23,2,4,6,6};
        int k = 7;
        boolean expected = true;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest6(){
        int[] nums = new int[]{0};
        int k = 1;
        boolean expected = false;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest7(){
        int[] nums = new int[]{1,0};
        int k = 2;
        boolean expected = false;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

    @Test
    void continuousSubarraySumTest8(){
        int[] nums = new int[]{2,4,3};
        int k = 6;
        boolean expected = true;
        boolean actual = continuousSubarraySum.checkSubarraySum(nums, k);
        assertEquals(expected, actual);
    }

}
