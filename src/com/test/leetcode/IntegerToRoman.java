package com.test.leetcode;

public class IntegerToRoman {
  private static final String[] KEYS = {
      "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
      "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC",
      "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM",
      "", "M", "MM", "MMM"};

  public String intToRoman(int num) {
    StringBuilder builder = new StringBuilder();
    int div = getDiv(num);
    while (div != 0) {
      builder.append(KEYS[getBase(div) + (num / div)]);
      num %= div;
      div /= 10;
    }
    return builder.toString();
  }

  private static int getBase(int div) {
    switch (div) {
      case 1:
        return 0;
      case 10:
        return 10;
      case 100:
        return 20;
      case 1000:
        return 30;
    }
    return 0;
  }

  private static int getDiv(int num) {
    if (num < 10) {
      return 1;
    } else if (num < 100) {
      return 10;
    } else if (num < 1000) {
      return 100;
    } else if (num < 4000) {
      return 1000;
    }
    return 0;
  }
}
