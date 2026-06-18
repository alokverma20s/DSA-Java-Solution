package com.alokverma20s.leetcode.medium;

public class ContainerWithMostWater {
    int maxArea(int[] height) {
        int ans = 0;
        int n = height.length;
        int i=0;
        int j =n-1;

        while(i < j){
            int area = Math.min(height[i], height[j]) * (j-i);
            ans = Math.max(area, ans);
            if(height[i] < height[j]) i++;
            else j--;
        }
        return ans;
    }
}
