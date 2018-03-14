package com.test.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

  public int threeSumClosest(int[] nums, int target) {
    int result = nums[0] + nums[1] + nums[nums.length - 1];
    int diff = Integer.MAX_VALUE;
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      int l = i + 1;
      int h = nums.length - 1;
      while (l < h) {
        int sum = nums[l] + nums[h] + nums[i];
        if (sum == target) {
          return target;
        } else if (sum > target) {
          if (sum - target < diff) {
            diff = sum - target;
            result = sum;
          }
          while (l < h && nums[h] == nums[h - 1]) h--;
          h--;
        } else {
          if (target - sum < diff) {
            diff = target - sum;
            result = sum;
          }
          while (l < h && nums[l] == nums[l + 1]) l++;
          l++;
        }
      }
    }
    return result;
  }
}
