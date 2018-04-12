package com.test.leetcode;

import com.test.leetcode.bean.ListNode;
import com.test.leetcode.util.Utils;
import edu.princeton.cs.algs4.StdOut;
import org.junit.Test;

public class PalindromeLinkedListTest {

  @Test
  public void isPalindrome() {
    ListNode head = Utils.createLinkedList(1, 2, 3, 4, 2, 2, 1);
    StdOut.println(new PalindromeLinkedList().isPalindrome(head));
  }
}