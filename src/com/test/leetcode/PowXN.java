package com.test.leetcode;

public class PowXN {

  class Solution {
    public double myPow(double x, int n) {
      double result = n > 0 ? pow(x, n) : pow(x, -n);
      if (result == 0D) {
        return result;
      }
      if (n < 0) {
        return 1D / result;
      }
      return result;
    }

    public double pow(double x, int n) {
      if (n == 0) {
        return 1;
      }
      if (n == 1) {
        return x;
      }
      double pow1 = myPow(x, n >> 1);
      if (pow1 == 0D) {
        return 0D;
      }
      if (Math.abs(pow1) > Math.abs(Double.MAX_VALUE / pow1)) {
        return 0D;
      }
      double pow = pow1 * pow1;
      if ((n & 0x01) == 1) {
        if (Math.abs(pow) > Math.abs(Double.MAX_VALUE / x)) {
          return 0D;
        }
        pow *= x;
      }
      return pow;
    }
  }
}
