package com.test.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (i != 0 && nums[i] == nums[i - 1]) { continue; }

      int l = i + 1;
      int h = nums.length - 1;
      final int flag = -nums[i];
      while (l < h) {
        if (nums[l] + nums[h] == flag) {
          result.add(Arrays.asList(nums[l], nums[h], nums[i]));
          while (l < h && nums[l] == nums[l + 1]) { l++; }
          while (l < h && nums[h] == nums[h - 1]) { h--; }
          l++;
          h--;
        } else if (nums[l] + nums[h] < flag) {
          l++;
        } else {
          h--;
        }
      }
    }
    return result;
  }
}
