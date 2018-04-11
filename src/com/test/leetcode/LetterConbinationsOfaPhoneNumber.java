package com.test.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterConbinationsOfaPhoneNumber {

  private static final char[][] KEYS = {
      {}, {},
      {'a', 'b', 'c'},
      {'d', 'e', 'f'},
      {'g', 'h', 'i'},
      {'j', 'k', 'l'},
      {'m', 'n', 'o'},
      {'p', 'q', 'r', 's'},
      {'t', 'u', 'v'},
      {'w', 'x', 'y', 'z'},
  };

  public List<String> letterCombinations(String digits) {
    List<String> ans = new ArrayList<>();
    if (digits.length() == 0) { return ans; }
    final char[] src = digits.toCharArray();
    for (char c : src) {
      if (c < '2' || c > '9') { return ans; }
    }
    ans.add("");
    for (char n : src) {
      List<String> t = new ArrayList<>();
      for (int i = 0; i < KEYS[n - '0'].length; i++) {
        for (String s : ans) {
          t.add(s + KEYS[n - '0'][i]);
        }
      }
      ans = t;
    }
    return ans;
  }
}
