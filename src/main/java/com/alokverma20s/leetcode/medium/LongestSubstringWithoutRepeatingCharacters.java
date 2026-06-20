package com.alokverma20s.leetcode.medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, n = s.length();
        int ans = 0;

        HashSet<Character> set = new HashSet<>();

        while (j < n) {
            if (set.contains(s.charAt(j))) {
                ans = Math.max(ans, j - i);
                while (s.charAt(i) != s.charAt(j)) {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            } else {
                set.add(s.charAt(j));
                j++;
            }
        }
        ans = Math.max(ans, j - i);
        return ans;
    }
}
