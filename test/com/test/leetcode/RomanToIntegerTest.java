package com.test.leetcode;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

  @Test
  public void test() {
    RomanToInteger romanToInteger = new RomanToInteger();
    StdOut.println(romanToInteger.romanToInt("MCMLXXVI"));
    StdOut.println(romanToInteger.romanToInt("MMMCMXCIX"));
    StdOut.println(romanToInteger.romanToInt("MDCCCXCIX"));
    StdOut.println(romanToInteger.romanToInt("MDCCCLXXXVIII"));
    StdOut.println(romanToInteger.romanToInt("DCXXI"));
  }
}