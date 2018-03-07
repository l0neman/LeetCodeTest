package com.test.leetcode;

public class MaximumSubarray {
  public int maxSubArray(int[] nums) {
    if (nums == null) {
      throw new AssertionError();
    }
    if (nums.length == 0) { return 0; }

    int sum = nums[0];
    int max = sum;
    for (int i = 1; i < nums.length; i++) {
      sum = (sum > 0 ? sum : 0) + nums[i];
      max = Math.max(max, sum);
    }
    return max;
  }
}
