package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramInStringTest {
    private final FindAllAnagramInString findAllAnagramInString = new FindAllAnagramInString();

    @Test
    void findAnagramTest1() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> expected = Arrays.asList(0,6);
        List<Integer> actual = findAllAnagramInString.findAnagrams(s, p);
        assertEquals(expected, actual);
    }

    @Test
    void findAnagramTest2() {
        String s = "abab", p = "ab";
        List<Integer> expected = Arrays.asList(0,1,2);
        List<Integer> actual = findAllAnagramInString.findAnagrams(s, p);
        assertEquals(expected, actual);
    }

}