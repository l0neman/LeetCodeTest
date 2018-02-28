package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

/**
 * Created by WangRuning on 2018/2/28.
 */
public class TwoSumTest {

  @Test
  public void test() {
    final TwoSum twoSum = new TwoSum();
    final int[] sum = twoSum.twoSum(new int[]{
        2, 7, 11, 15
    }, 26);
    StdOut.println(sum[0]);
    StdOut.println(sum[1]);
  }
}