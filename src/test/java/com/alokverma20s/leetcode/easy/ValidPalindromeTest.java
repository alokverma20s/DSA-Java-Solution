package com.alokverma20s.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private final ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void validPalindromeTest1() {
        String s = "A man, a plan, a canal: Panama";
        boolean expected = true;
        boolean actual = validPalindrome.validPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    void validPalindromeTest2() {
        String s = "race a car";
        boolean expected = false;
        boolean actual = validPalindrome.validPalindrome(s);
        assertEquals(expected, actual);
    }

    @Test
    void validPalindromeTest3() {
        String s = " ";
        boolean expected = true;
        boolean actual = validPalindrome.validPalindrome(s);
        assertEquals(expected, actual);
    }

}
