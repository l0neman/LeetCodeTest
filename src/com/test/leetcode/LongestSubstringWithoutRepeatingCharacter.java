package com.test.leetcode;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacter {

  /**
   * 使用 int 型数组代替 Map 提高效率
   */
  public static int lengthOfLongestSubstring(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    int[] hash = new int[256];
    Arrays.fill(hash, -1);
    final char[] chars = s.toCharArray();
    int start = 0;
    hash[chars[start]] = start;
    int end = 1;
    int max = 1;
    while (end < chars.length) {
      int index = hash[chars[end]];
      if (index != -1) {
        for (int i = start; i <= index; i++) {
          final Integer integer = hash[chars[i]];
          if (integer != -1 && integer <= index) {
            hash[chars[i]] = -1;
          }
        }
        start = index + 1;
      }
      max = Math.max(max, end - start + 1);
      hash[chars[end]] = end;
      end++;
    }
    return max;
  }

  /**
   * 精简后
   */
  public int lengthOfLongestSubstring2(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    int[] hash = new int[256];
    Arrays.fill(hash, -1);
    final char[] chars = s.toCharArray();
    int start = 0;
    hash[chars[start]] = start;
    int max = 1;
    for (int end = 1; end < chars.length; end++) {
      start = Math.max(hash[chars[end]] + 1, start);
      max = Math.max(max, end - start + 1);
      hash[chars[end]] = end;
    }
    return max;
  }
}
