package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class LongestCommonPrefixTest {

  @Test
  public void longestCommonPrefix() {
    String[] strs = {
        "aaa",
        "a",
        "b",
    };
    StdOut.println(new LongestCommonPrefix().longestCommonPrefix(strs));
  }
}