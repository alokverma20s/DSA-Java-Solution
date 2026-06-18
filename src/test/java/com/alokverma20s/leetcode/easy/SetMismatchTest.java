package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMismatchTest {
    private final   SetMismatch setMismatch;

    public SetMismatchTest(){
        setMismatch = new SetMismatch();
    }

    @Test
    void setMismatchTest1(){
        int[] nums = new int[] {1,2,2,4};
        int[] expected = new int[]{2,3};
        int[] actual = setMismatch.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }

    @Test
    void setMismatchTest2(){
        int[] nums = new int[] {1,1};
        int[] expected = new int[]{1, 2};
        int[] actual = setMismatch.findErrorNums(nums);
        assertArrayEquals(expected, actual);
    }
}
