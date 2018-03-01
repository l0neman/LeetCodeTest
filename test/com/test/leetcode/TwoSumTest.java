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
    final int[] sum = twoSum.twoSumWithHashTable2(new int[]{
        4, 1, 8, 6, 9
    }, 14);
    StdOut.println(sum[0]);
    StdOut.println(sum[1]);
  }
}