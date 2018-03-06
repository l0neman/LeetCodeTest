package com.test.leetcode;

public class SqrtX {

  public int mySqrt2(int x) {
    if (x <= 1) { return x; }

    int low = 1;
    int high = x;
    while (high - low > 1) {
      int mid = low + ((high - low) >> 1);
      int v = x / mid;
      if (v == x) {
        return mid;
      } else if (v < mid) {
        high = mid;
      } else {
        low = mid;
      }
    }
    return low;
  }
}
