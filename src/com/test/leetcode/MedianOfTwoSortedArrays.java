package com.test.leetcode;

public class MedianOfTwoSortedArrays {

  /* 复杂度 O(n/2) */
  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if (nums1.length == 0 && nums2.length == 0) {
      return 0D;
    }
    int[] nums = new int[nums1.length + nums2.length];
    int i1 = 0;
    int i2 = 0;
    int i = 0;
    final int mid = nums.length >> 1;
    while (i1 < nums1.length && i2 < nums2.length) {
      if (nums1[i1] < nums2[i2]) {
        nums[i++] = nums1[i1];
        i1++;
      } else {
        nums[i++] = nums2[i2];
        i2++;
      }
      if (i == mid + 1) {
        return getMid(nums);
      }
    }
    if (i1 == nums1.length) {
      for (; i2 < nums2.length; i2++) {
        nums[i++] = nums2[i2];
        if (i == mid + 1) {
          return getMid(nums);
        }
      }
    } else if (i2 == nums2.length) {
      for (; i1 < nums1.length; i1++) {
        nums[i++] = nums1[i1];
        if (i == mid + 1) {
          return getMid(nums);
        }
      }
    }
    return getMid(nums);
  }

  private static double getMid(int[] nums) {
    final int mid = nums.length >> 1;
    if ((nums.length & 0x01) == 1) {
      return nums[mid];
    } else {
      return (nums[mid] + nums[mid - 1]) / 2D;
    }
  }
}
