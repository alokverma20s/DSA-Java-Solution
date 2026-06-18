package com.alokverma20s.leetcode.medium;

public class TwoSum2 {
    int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j = n-1;

        while(i < j){
            int current = numbers[i] + numbers[j];
            if(current > target) j--;
            else if(current == target) return new int[] {i+1, j+1};
            else i++;
        }
        return new int[] {-1, -1};
    }
}
