package com.test.leetcode;

public class LongestPalindromicSubstring {
  private static int[] PAIR = {0, 0};

  public static String longestPalindrome(String s) {
    if (s == null || s.length() == 0) {
      return "";
    }
    if (s.length() == 1) {
      return s;
    }
    int max = 0;
    int maxStart = 0;
    int maxEnd = 0;
    final char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {

      int[] pair = extend(chars, i, i);

      if (pair[1] - pair[0] > max) {
        max = pair[1] - pair[0];
        maxStart = pair[0];
        maxEnd = pair[1];
      }

      pair = extend(chars, i, i + 1);

      if (pair[1] - pair[0] > max) {
        max = pair[1] - pair[0];
        maxStart = pair[0];
        maxEnd = pair[1];
      }
    }
    return String.valueOf(chars, maxStart, maxEnd - maxStart + 1);
  }

  private static int[] /* PAIR */ extend(char[] chars, int start, int end) {
    if (start >= 0 && end < chars.length && chars[start] == chars[end]) {
      do {
        start--;
        end++;
      } while (start >= 0 && end < chars.length && chars[start] == chars[end]);
      start++;
      end--;
    } else {
      start = end = 0;
    }
    PAIR[0] = start;
    PAIR[1] = end;
    return PAIR;
  }
}
