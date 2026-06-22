package com.alokverma20s.leetcode.easy;

public class MaximumAverageSubarrayI {
    double findMaxAverage(int[] nums, int k) {
        double currentSum =0;

        for(int i=0; i< k; i++){
            currentSum += nums[i];
        }
        double ans = Integer.MIN_VALUE;

        for(int i=k; i< nums.length; i++){
            // System.out.println(currentSum/k);
            ans = Math.max(ans, currentSum/k);
            currentSum -= nums[i-k];
            currentSum += nums[i];
        }
        ans = Math.max(ans, currentSum/k);
        return ans;
    }
}
