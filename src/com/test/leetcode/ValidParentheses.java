package com.test.leetcode;

import java.util.LinkedList;

public class ValidParentheses {
  private LinkedList<Character> stack = new LinkedList<>();

  /* 烂 */
  public boolean isValid(String s) {
    if (s == null) { return false; }

    if ((s.length() & 0x01) == 1) {
      return false;
    }
    final char[] strings = s.toCharArray();
    for (final char c : strings) {
      switch (c) {
        case '(':
        case '[':
        case '{':
          stack.push(c);
          break;
        case ')':
          if (stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
          break;
      }
    }
    return stack.isEmpty();
  }

  /* 参考并改良版 */
  public boolean isValid2(String s) {
    if (s == null) { return false; }

    if ((s.length() & 0x01) == 1) {
      return false;
    }
    final char[] str = s.toCharArray();
    char[] stack = new char[str.length];
    int top = -1;
    for (final char c : str) {
      switch (c) {
        case '(':
          stack[++top] = ')';
          break;
        case '[':
          stack[++top] = ']';
          break;
        case '{':
          stack[++top] = '}';
          break;
        default:
          if (top == -1 || stack[top--] != c) {
            return false;
          }
      }
    }
    return top == -1;
  }
}
