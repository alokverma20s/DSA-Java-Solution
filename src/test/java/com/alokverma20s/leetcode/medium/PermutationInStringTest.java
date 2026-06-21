package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {
    private final PermutationInString permutationInString = new PermutationInString();

    @Test
    void checkPermutationTest1(){
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean expected = true;
        boolean actual = permutationInString.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void checkPermutationTest2(){
        String s1 = "ab";
        String s2 = "eidboaoo";
        boolean expected = false;
        boolean actual = permutationInString.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void checkPermutationTest3(){
        String s1 = "adc";
        String s2 = "dcda";
        boolean expected = true;
        boolean actual = permutationInString.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }

    @Test
    void checkPermutationTest4(){
        String s1 = "ab";
        String s2 = "a";
        boolean expected = false;
        boolean actual = permutationInString.checkInclusion(s1, s2);
        assertEquals(expected, actual);
    }

}