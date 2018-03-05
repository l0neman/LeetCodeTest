package com.test.leetcode;

public class ImplementstrStr {

  /* KMP算法实现 */
  public int strStr(String haystack, String needle) {
    if ("".equals(needle)) {
      return 0;
    }
    if (haystack.length() < needle.length()) {
      return -1;
    }
    char[] haystacks = haystack.toCharArray();
    char[] needles = needle.toCharArray();
    int i = 0;
    int j = 0;
    int[] next = getNext(needles);
    while (i < haystacks.length && j < needles.length) {
      if (j == -1 || haystacks[i] == needles[j]) {
        i++;
        j++;
      } else {
        j = next[j];
      }
    }
    return j == needles.length ? i - needles.length : -1;
  }

  private static int[] getNext(char[] match) {
    int i = 0;
    int j = -1;
    int[] next = new int[match.length];
    final int max = match.length - 1;
    next[0] = -1;
    while (i < max) {
      if (j == -1 || match[i] == match[j]) {
        i++;
        j++;
        if (match[i] == match[j]) {
          next[i] = next[j];
        } else {
          next[i] = j;
        }
      } else {
        j = next[j];
      }
    }
    return next;
  }

  /* 朴素匹配 */
  public int strStr2(String haystack, String needle) {
    if ("".equals(haystack) && "".equals(needle)) {
      return 0;
    }
    if (haystack.length() < needle.length()) {
      return -1;
    }
    char[] haystacks = haystack.toCharArray();
    char[] needles = needle.toCharArray();

    int max = haystacks.length - needles.length;
    int i = 0;
    int j = 0;
    int last = i;
    while (i <= max) {
      for (j = 0; j < needles.length; j++) {
        if (haystacks[i] == needles[j]) {
          i++;
        } else {
          i = ++last;
          break;
        }
      }
      if (j == needles.length) {
        break;
      }
    }
    if (last == max + 1) {
      return -1;
    } else {
      return i - needles.length;
    }
  }
}
