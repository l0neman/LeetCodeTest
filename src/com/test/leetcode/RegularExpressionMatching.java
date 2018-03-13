package com.test.leetcode;

public class RegularExpressionMatching {
  public boolean isMatch(String text, String pattern) {
    return isMatch(text.toCharArray(), pattern.toCharArray(), 0, 0);
  }

  public boolean isMatch(char[] text, char[] pattern, int ts, int ps) {
    if (ps >= pattern.length) {
      return ts >= text.length;
    }
    boolean first = ts < text.length &&
        (text[ts] == pattern[ps] || pattern[ps] == '.');

    if (ps + 2 <= pattern.length && pattern[ps + 1] == '*') {
      return isMatch(text, pattern, ts, ps + 2) ||
          (first && isMatch(text, pattern, ts + 1, ps));
    } else {
      return first && isMatch(text, pattern, ts + 1, ps + 1);
    }
  }

  private Boolean[][] memo;

  public boolean isMatch2(String text, String pattern) {
    memo = new Boolean[text.length()][pattern.length()];
    return dpMatch(text.toCharArray(), pattern.toCharArray(), 0, 0);
  }

  private boolean dpMatch(char[] text, char[] pattern, int ts, int ps) {
    if (memo[ts][ps] != null) {
      return memo[ts][ps];
    }
    boolean ans;
    if (ps >= pattern.length) {
      ans = ts >= text.length;
    } else {
      boolean first = ts < text.length &&
          (text[ts] == pattern[ps] || pattern[ps] == '.');
      if (ps + 2 <= pattern.length && pattern[ps + 1] == '*') {
        ans = dpMatch(text, pattern, ts, ps + 2) ||
            (first && dpMatch(text, pattern, ts + 1, ps));
      } else {
        ans = first && dpMatch(text, pattern, ts + 1, ps + 1);
      }
    }
    memo[ts][ps] = ans;
    return ans;
  }

  public boolean isMatch3(String text, String pattern) {
    final char[] texts = text.toCharArray();
    final char[] patterns = pattern.toCharArray();
    boolean[][] dp = new boolean[texts.length + 1][patterns.length + 1];
    dp[texts.length][patterns.length] = true;

    for (int i = texts.length; i >= 0; i--) {
      for (int j = patterns.length - 1; j >= 0; j--) {
        boolean first = (i < texts.length) &&
            (patterns[j] == texts[i] || patterns[j] == '.');
        if (j + 1 < patterns.length && patterns[j + 1] == '*') {
          dp[i][j] = dp[i][j + 2] || first && dp[i + 1][j];
        } else {
          dp[i][j] = first && dp[i + 1][j + 1];
        }
      }
    }
    return dp[0][0];
  }
}
