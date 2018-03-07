package com.test.leetcode;

public class RangeSumQueryImmutable {
  class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
      this.nums = nums;
      if (nums == null || nums.length == 0) {
        return;
      }
      for (int i = 1; i < nums.length; i++) {
        nums[i] = nums[i] + nums[i - 1];
      }
    }

    public int sumRange(int i, int j) {
      if (nums == null || i > j || j > nums.length) {
        throw new AssertionError("");
      }
      if (i == 0) {
        return nums[j];
      }
      return nums[j] - nums[i - 1];
    }
  }
}
