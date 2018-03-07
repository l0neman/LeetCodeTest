package com.test.leetcode;

public class ClimbingStairs {

  public int climbStairs(int n) {
    if (n <= 2) { return n; }
    int[] res = new int[n];
    res[0] = 1;
    res[1] = 2;
    for (int i = 3; i <= n; i++) {
      res[i - 1] = res[i - 1 - 1] + res[i - 2 - 1];
    }
    return res[n - 1];
  }
}
