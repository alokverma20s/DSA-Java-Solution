package com.alokverma20s.leetcode.medium;

public class PermutationInString {
    private boolean contains(int[] mapS1, int mapS2[]){
        for(int i=0;i< 26; i++){
            if(mapS1[i] != mapS2[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int n =  s1.length();
        int[] mapS1 = new int[26];
        int[] mapS2 = new int[26];
        for(int i =0; i< n; i++){
            mapS1[s1.charAt(i) - 'a']++;
            mapS2[s2.charAt(i) - 'a']++;
        }

        for(int i = n; i< s2.length(); i++){
            if(contains(mapS1, mapS2)) return true;
            mapS2[s2.charAt(i-n)-'a']--;
            mapS2[s2.charAt(i)-'a']++;
        }
        if(contains(mapS1, mapS2)) return true;
        return false;
    }
}
