package com.test.leetcode;

public class StringToInteger {

  public int myAtoi(String str) {
    if(str == null || str.isEmpty()) {
      return 0;
    }

    char[] chars = str.toCharArray();
    int sign = 1;
    int base = 0;
    int i = 0;
    /* skip space */
    while (i < chars.length && chars[i] == ' ') { i++; }

    /* ensure signal */
    if (i < chars.length && chars[i] == '-' || chars[i] == '+') {
      sign = 1 - 2 * (chars[i++] == '-' ? 1 : 0);
    }

    /* calculation */
    while (i < chars.length && chars[i] >= '0' && chars[i] <= '9') {
      /* is overflow */
      if (base > Integer.MAX_VALUE / 10 ||
          (base == Integer.MAX_VALUE / 10 && chars[i] - '0' > 7)) {
        if (sign == 1) {
          return Integer.MAX_VALUE;
        } else {
          return Integer.MIN_VALUE;
        }
      }
      base = 10 * base + (chars[i++] - '0');
    }
    return base * sign;
  }
}
