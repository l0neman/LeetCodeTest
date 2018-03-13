package com.test.leetcode;

public class ContainerWithMostWaster {

  public int maxArea(int[] height) {
    int max = 0;
    int l = 0;
    int h = height.length - 1;
    while (l < h) {
      int minH = height[l] < height[h] ? height[l] : height[h];
      max = Math.max(max, minH * (h - l));
      if (height[l] < height[h]) {
        while (l < h && height[l] <= minH) l++;
      } else {
        while (l < h && height[h] <= minH) h--;
      }
    }
    return max;
  }
}
