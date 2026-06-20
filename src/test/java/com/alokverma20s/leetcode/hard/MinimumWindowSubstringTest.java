package com.alokverma20s.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    private final MinimumWindowSubstring minimumWindowSubstring= new MinimumWindowSubstring();

    @Test
    void minimumWindowSubstringTest1(){
        String s = "ADOBECODEBANC", t = "ABC";
        String expected = "BANC";
        String actual = minimumWindowSubstring.minWindow(s, t);
        assertEquals(expected, actual);
    }


    @Test
    void minimumWindowSubstringTest2(){
        String s = "a", t = "a";
        String expected = "a";
        String actual = minimumWindowSubstring.minWindow(s, t);
        assertEquals(expected, actual);
    }

    @Test
    void minimumWindowSubstringTest3(){
        String s = "a", t = "aa";
        String expected = "";
        String actual = minimumWindowSubstring.minWindow(s, t);
        assertEquals(expected, actual);
    }



}
