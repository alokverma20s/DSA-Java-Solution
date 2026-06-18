package com.alokverma20s.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i< n; i++){
            int val = Math.abs(nums[i]);

            if(nums[val-1] < 0) ans.add(val);
            nums[val-1] = -Math.abs(nums[val-1]);
        }
        return ans;
    }
}
