package com.test.leetcode;

public class RomanToInteger {
  private static final String[] KEYS = {
      "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
      "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
      "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
      "M", "MM", "MMM"};

  public int romanToInt(String s) {
    int result = 0;
    for (int i = 0; i < KEYS.length; i++) {
      if (s.endsWith(KEYS[i])) {
        s = s.substring(0, s.length() - KEYS[i].length());
        result += power10(i / 9) * (i % 9 + 1);
        if (s.length() == 0) {
          return result;
        }
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
