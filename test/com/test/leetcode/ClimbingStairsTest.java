package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class ClimbingStairsTest {

  @Test
  public void climbStairs() {
    final ClimbingStairs stairs = new ClimbingStairs();
    StdOut.println(stairs.climbStairs(4));
    StdOut.println(stairs.climbStairs(6));
    StdOut.println(stairs.climbStairs(7));
    StdOut.println(stairs.climbStairs(4));
    StdOut.println(stairs.climbStairs(20));
  }
}