package com.alokverma20s.leetcode.easy;

public class ValidPalindrome {
    boolean validPalindrome(String s) {

        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            } else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
