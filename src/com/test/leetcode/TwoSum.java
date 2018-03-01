package com.test.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WangRuning on 2018/2/28.
 *
 * 两数之和
 *
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
        /* 用减法，避免溢出 ( nums[i] + nums[j] == target 可能溢出) */
        if (nums[i] == target - nums[j]) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  /* 使用一个hash表 两遍循环 */
  public int[] twoSumWithHashTable(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int key = target - nums[i];
      if (map.containsKey(key) && map.get(key) != i) {
        return new int[]{i, map.get(key)};
      }
    }
    return null;
  }

  /* 使用一个hash表 一遍循环 */
  public int[] twoSumWithHashTable2(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return null;
    }
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int key = target - nums[i];
      if (map.containsKey(key)) {
        return new int[]{i, map.get(key)};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}
