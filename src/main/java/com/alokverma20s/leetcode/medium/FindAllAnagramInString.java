package com.alokverma20s.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramInString {
    private boolean contains(int[] mapP, int[] mapS){
        for(int i=0;i< 26; i++){
            if(mapP[i] != mapS[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return  List.of();
        int n =  p.length();
        int[] mapP = new int[26];
        int[] mapS = new int[26];
        for(int i =0; i< n; i++){
            mapP[p.charAt(i) - 'a']++;
            mapS[s.charAt(i) - 'a']++;
        }
        List<Integer> ans = new ArrayList<>();

        for(int i = n; i< s.length(); i++){
            if(contains(mapP, mapS)) ans.add(i-n);
            mapS[s.charAt(i-n)-'a']--;
            mapS[s.charAt(i)-'a']++;
        }
        if(contains(mapP, mapS)) ans.add(s.length()-n);
        return ans;
    }
}
