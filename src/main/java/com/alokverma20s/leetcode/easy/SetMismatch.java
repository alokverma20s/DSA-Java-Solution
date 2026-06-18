package com.alokverma20s.leetcode.easy;

public class SetMismatch {
    int[] findErrorNums(int[] nums) {
        int n = nums.length;

        int[] ans = new int[] {0,0};

        for(int i=0; i<n; i++){
            int val = Math.abs(nums[i]);

            if(nums[val-1] < 0) ans[0] = val;
            nums[val-1] = -Math.abs(nums[val-1]);
        }

        for(int i=0; i< n; i++){
            if(nums[i] > 0) ans[1] = i+1;
        }
        return ans;
    }
}
