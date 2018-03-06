package com.test.leetcode;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) { return ""; }

    String longestPrefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      longestPrefix = longestCommonPrefix2(longestPrefix, strs[i]);
    }
    return longestPrefix;
  }

  private static String longestCommonPrefix2(String s1, String s2) {
    if (s1.length() == 0 || s2.length() == 0) {
      return "";
    }
    final char[] a1 = s1.toCharArray();
    final char[] a2 = s2.toCharArray();
    int i = 0;
    while (i < a1.length && i < a2.length) {
      if (a1[i] == a2[i]) {
        i++;
      } else { break; }
    }
    if (i != 0) {
      return s1.substring(0, i);
    }
    return "";
  }
}
