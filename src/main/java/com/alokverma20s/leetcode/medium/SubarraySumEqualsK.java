package com.alokverma20s.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    int subarraySum(int[] nums, int k) {
        Map<Long, Integer> mp = new HashMap<>();
        int cnt = 0;
        mp.put(0L, 1);
        long preSum =  0;

        for (int num : nums) {
            preSum += num;
            if (mp.containsKey(preSum - k)) {
                cnt += mp.get(preSum - k);
            }
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }
}
