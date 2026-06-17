package com.alokverma20s.leetcode.medium;

import java.util.Stack;

public class Pattern321 {
    boolean find132Pattern(int[] nums) {
        int s3 = Integer.MIN_VALUE;
        int n =  nums.length;

        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            int s1 = nums[i];
            if(s1 < s3) return true;

            else{
                while (!stack.isEmpty() && stack.peek() < s1) {
                    s3 = stack.pop();
                }
                stack.push(s1);
            }
        }
        return false;
    }
}
