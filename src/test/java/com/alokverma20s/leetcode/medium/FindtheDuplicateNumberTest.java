package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindtheDuplicateNumberTest {

    private final FindtheDuplicateNumber findtheDuplicateNumber;

    FindtheDuplicateNumberTest() {
        findtheDuplicateNumber = new FindtheDuplicateNumber();
    }

    @Test
    public void findTheDuplicateNumber1() {
        int[] nums = new int[] {1,3,4,2,2};
        int expected = 2;
        int actual = findtheDuplicateNumber.findTheDuplicateNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void findTheDuplicateNumber2() {
        int[] nums = new int[] {3,1,3,4,2};
        int expected = 3;
        int actual = findtheDuplicateNumber.findTheDuplicateNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void findTheDuplicateNumber3() {
        int[] nums = new int[] {3,3,3,3,3};
        int expected = 3;
        int actual = findtheDuplicateNumber.findTheDuplicateNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void findTheDuplicateNumber4() {
        int[] nums = new int[] {2,6,4,1,3,1,5};
        int expected = 1;
        int actual = findtheDuplicateNumber.findTheDuplicateNumber(nums);
        assertEquals(expected, actual);
    }

}
