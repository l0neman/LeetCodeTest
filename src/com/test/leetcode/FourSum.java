package com.test.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

  private List<List<Integer>> result = new ArrayList<>();

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 3; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) { continue; }
      threeSum(nums, target - nums[i], i + 1, i);
    }
    return result;
  }

  public void threeSum(int[] nums, int target, int start, int first) {
    int l;
    int h;
    for (int i = start; i < nums.length - 2; i++) {
      if (i != start && nums[i] == nums[i - 1]) { continue; }

      l = i + 1;
      h = nums.length - 1;
      final int flag = target - nums[i];
      while (l < h) {
        if (nums[l] + nums[h] == flag) {
          result.add(Arrays.asList(nums[l], nums[h], nums[i], nums[first]));
          while (l < h && nums[l] == nums[l + 1]) { l++; }
          l++;
          while (l < h && nums[h] == nums[h - 1]) { h--; }
          h--;
        } else if (nums[l] + nums[h] < flag) {
          l++;
        } else {
          h--;
        }
      }
    }
  }
}
