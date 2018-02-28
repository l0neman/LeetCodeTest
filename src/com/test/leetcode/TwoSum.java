package com.test.leetcode;

/**
 * Created by WangRuning on 2018/2/28.
 * <p>
 * 给定一个整数数列，找出其中和为特定值的那两个数。
 * 你可以假设每个输入都只会有一种答案，同样的元素不能被重用。
 */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }
}
