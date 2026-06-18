package com.alokverma20s.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void ContainerWithMostWaterTest1() {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        int expected = 49;
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

    @Test
    void ContainerWithMostWaterTest2() {
        int[] height = new int[] {1,1};
        int expected = 1;
        int actual = containerWithMostWater.maxArea(height);
        assertEquals(expected, actual);
    }

}
