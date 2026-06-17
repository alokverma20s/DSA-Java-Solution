package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pattern321Test {
    private final Pattern321 pattern321;

    Pattern321Test() {
        pattern321 = new Pattern321();
    }


    @Test
    public void testCase1() {
        int[] nums = new int[] {1,2,3,4};
        boolean expected = false;
        boolean actual = pattern321.find132Pattern(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int[] nums = new int[] {3,1,4,2};
        boolean expected = true;
        boolean actual = pattern321.find132Pattern(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testCase3() {
        int[] nums = new int[] {-1,3,2,0};
        boolean expected = true;
        boolean actual = pattern321.find132Pattern(nums);
        assertEquals(expected, actual);
    }

}
