package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

  @Test
  public void isMatch() {
    StdOut.println(
        new RegularExpressionMatching().isMatch3(
            "ab", "a.*c"
        )
    );
  }
}