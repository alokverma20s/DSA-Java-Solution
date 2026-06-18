package com.alokverma20s.leetcode.easy;

import java.util.HashMap;

public class TwoSum {
    int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i< n; i++){
            int rem = target - nums[i];
            if(mp.get(rem) != null)
                return new int[] {mp.get(rem), i};
            else
                mp.put(nums[i], i);

        }
        return new int[] {-1, -1};
    }
}
