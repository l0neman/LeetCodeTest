package com.test.leetcode;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    if(x < 10) {
      return true;
    }
    int halfReverse = 0;
    while (x > halfReverse) {
      halfReverse = halfReverse * 10 + x % 10;
      x /= 10;
    }
    return x == halfReverse || halfReverse / 10 == x;
  }
}
