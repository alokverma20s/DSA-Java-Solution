package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedinanArrayTest {
    private final FindAllNumbersDisappearedinanArray findAllNumbersDisappearedinanArray;

    FindAllNumbersDisappearedinanArrayTest(){
        findAllNumbersDisappearedinanArray = new FindAllNumbersDisappearedinanArray();
    }

    @Test
    void findAllNumbersDisappeared1() {
        int[] input = new int[] {4,3,2,7,8,2,3,1};
        List<Integer> expected = Arrays.asList(5,6);
        List<Integer> actual= findAllNumbersDisappearedinanArray.findAllNumbersDisappeared(input);
        assertEquals(expected, actual);
    }

    @Test
    void findAllNumbersDisappeared2() {
        int[] input = new int[] {1,1};
        List<Integer> expected = List.of(2);
        List<Integer> actual = findAllNumbersDisappearedinanArray.findAllNumbersDisappeared(input);
        assertEquals(expected, actual);

    }
}
