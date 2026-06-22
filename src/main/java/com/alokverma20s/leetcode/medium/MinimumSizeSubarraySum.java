package com.alokverma20s.leetcode.medium;

public class MinimumSizeSubarraySum {
    int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;

        int i= 0, j = 0;
        int n = nums.length;
        int curSum = 0;

        while(j < n){
            if(curSum < target){
                curSum += nums[j++];
            }
            else{
                while(i < j && target <= curSum){
                    minLen = Math.min(minLen, j-i);
                    curSum -= nums[i++];
                }
            }
        }
        while(target <= curSum){
            minLen = Math.min(minLen, j-i);
            curSum -= nums[i++];
        }

        return minLen == Integer.MAX_VALUE ? 0: minLen;
    }
}
