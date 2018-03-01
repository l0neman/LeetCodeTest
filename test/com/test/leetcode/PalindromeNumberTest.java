package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class PalindromeNumberTest {
  @Test
  public void test() {
    PalindromeNumber palindromeNumber = new PalindromeNumber();
    StdOut.println(palindromeNumber.isPalindrome(19391));
    StdOut.println(palindromeNumber.isPalindrome(123878321));
    StdOut.println(palindromeNumber.isPalindrome(11));
    StdOut.println(palindromeNumber.isPalindrome(112));
  }
}