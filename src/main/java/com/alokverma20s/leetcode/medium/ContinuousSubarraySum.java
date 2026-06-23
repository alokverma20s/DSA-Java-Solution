package com.alokverma20s.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Long, Integer> mp = new HashMap<>();
        mp.put(0L, -1);
        long preSum =  0;

        for(int i=0; i< n; i++){
            preSum+= nums[i];
            if(mp.containsKey(preSum % k) && (i - mp.get(preSum % k) >= 2)){
                return true;
            }
            if(!mp.containsKey(preSum % k))
                mp.put(preSum %k , i);
        }

        return false;
    }
}
