package com.alokverma20s.leetcode.medium;

public class FindtheDuplicateNumber {
    int findTheDuplicateNumber(int[] nums) {
        int n =  nums.length;

        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);

            if(nums[val-1] < 0) return val;
            nums[val-1] = -Math.abs(nums[val-1]);
        }
        return -1;
    }
}
