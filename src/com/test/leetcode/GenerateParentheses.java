package com.test.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

  private List<String> result = new ArrayList<>();

  public List<String> generateParentheses(int n) {
    backtrack("", 0, 0, n);
    return result;
  }

  private void backtrack(String ans, int open, int close, int max) {
    if (ans.length() == max << 1) {
      result.add(ans);
      return;
    }
    if (open < max) {
      backtrack(ans + '(', open + 1, close, max);
    }
    if (close < open) {
      backtrack(ans + ')', open, close + 1, max);
    }
  }
}
