package com.test.leetcode;

public class RomanToInteger {
  private static final String[] KEYS = {
      "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
      "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
      "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
      "M", "MM", "MMM"};

  public int romanToInt(String s) {
    int result = 0;
    for (int i = KEYS.length - 1; i >= 0; ) {
      if (s.startsWith(KEYS[i])) {
        s = s.substring(KEYS[i].length(), s.length());
        result += power10(i / 9) * (i % 9 + 1);
        if (s.length() == 0) {  return result; }
        /* 跳至下一层，优化效率 */
        i = i / 9 * 9 - 1;
      } else {
        i--;
      }
    }
    return 0;
  }

  private static int power10(int exponent) {
    switch (exponent) {
      case 0:
        return 1;
      case 1:
        return 10;
      case 2:
        return 100;
      case 3:
        return 1000;
      default:
        throw new AssertionError("error");
    }
  }
}
