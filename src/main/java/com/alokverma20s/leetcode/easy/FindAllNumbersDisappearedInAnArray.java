package com.alokverma20s.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    List<Integer> findAllNumbersDisappeared(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n; i++){
            int val = Math.abs(nums[i]);

            nums[val - 1] = -Math.abs(nums[val - 1]);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
