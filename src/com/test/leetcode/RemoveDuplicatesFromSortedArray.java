package com.test.leetcode;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 1) {
      return 1;
    }
    int index = 0;
    int find = 0;
    while (find < nums.length) {
      nums[index] = nums[find];
      while (find < nums.length && nums[find] == nums[index]) {
        find++;
      }
      index++;
    }
    return index;
  }
}
