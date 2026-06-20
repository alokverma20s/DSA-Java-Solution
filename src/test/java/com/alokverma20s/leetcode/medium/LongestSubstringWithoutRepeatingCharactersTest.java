package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {

    private final LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void longestSubstringTest1() {
        String s = "abcabcbb";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void longestSubstringTest2() {
        String s = "bbbbb";
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void longestSubstringTest3() {
        String s = "pwwkew";
        int expected = 3;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

    @Test
    public void longestSubstringTest4() {
        String s = " ";
        int expected = 1;
        int actual = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, actual);
    }

}
