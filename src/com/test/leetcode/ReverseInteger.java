package com.test.leetcode;

import java.util.LinkedList;

public class ReverseInteger {

  /* 改进算法 */
  public int reverse2(int x) {
    long result = 0;
    while (x != 0) {
      result = result * 10 + x % 10;
      if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        return 0;
      }
      x /= 10;
    }
    return (int) result;
  }

  public int reverse(int x) {
    LinkedList<Integer> stack = new LinkedList<>();
    while (x != 0) {
      stack.add(x % 10);
      x /= 10;
    }

    long result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop() * power10(stack.size());
      /* 判断范围 */
      if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
        return 0;
      }
    }
    return (int) result;
  }

  /* 计算 10 的次方 */
  private static long power10(int exponent) {
    if (exponent == 0) {
      return 1;
    }
    if (exponent == 1) {
      return 10;
    }
    long result = power10(exponent >> 1);
    result *= result;
    if ((exponent & 0x01) == 1) {
      result *= 10;
    }
    return result;
  }
}
