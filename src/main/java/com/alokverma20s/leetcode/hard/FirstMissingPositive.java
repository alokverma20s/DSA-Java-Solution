package com.alokverma20s.leetcode.hard;

public class FirstMissingPositive {
    int firstMissingPositive(int[] nums) {
        int n =  nums.length;

        // Step 1: Clean up the array
        for(int i = 0; i< n; i++){
            if(nums[i] <= 0 || nums[i] > n) nums[i] = n+1;
        }

        // Step 2: Mark the presence
        for(int i = 0; i< n; i++){
            int val = Math.abs(nums[i]);

            if(val <= n){
                nums[val-1] = -Math.abs(nums[val-1]);
            }
        }

        // Step 3: Find the first missing positive
        for(int i = 0; i< n; i++){
            if(nums[i] > 0) return i+1;
        }
        return n+1;
    }
}
