package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray removeDuplicates = new RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicatesTest1() {
        int[] nums = new int[] {1,1,2};
        int expected = 2;
        int actual = removeDuplicates.removeDuplicates(nums);
        assertEquals(expected, actual);
    }

}
