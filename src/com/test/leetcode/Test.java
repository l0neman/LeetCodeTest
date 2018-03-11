package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;

public class Test {
  public static void main(String[] args) {
    StdOut.println(myPow(2.0D, 10));
  }

  public static double myPow(double x, int n) {
    if (n == 0) {
      return 1;
    }
    if (n == 1) {
      return x;
    }
    double pow1 = myPow(x, n >> 1);
    double pow = pow1 * pow1;
    if ((n & 0x01) == 1) {
      pow *= x;
    }
    return pow;
  }
}
