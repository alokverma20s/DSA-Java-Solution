package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInAnArrayTest {

    private final FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();

    @Test
    void findAllDuplicatesInAnArrayTest1() {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> expected = Arrays.asList(2,3);
        List<Integer> actual = findAllDuplicatesInAnArray.findDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void findAllDuplicatesInAnArrayTest2() {
        int[] nums = new int[] {1,1,2};
        List<Integer> expected = List.of(1);
        List<Integer> actual = findAllDuplicatesInAnArray.findDuplicates(nums);
        assertEquals(expected, actual);
    }

    @Test
    void findAllDuplicatesInAnArrayTest3() {
        int[] nums = new int[] {1};
        List<Integer> expected = List.of();
        List<Integer> actual = findAllDuplicatesInAnArray.findDuplicates(nums);
        assertEquals(expected, actual);
    }
}
