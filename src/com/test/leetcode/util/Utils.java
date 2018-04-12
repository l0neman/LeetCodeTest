package com.test.leetcode.util;

import com.test.leetcode.bean.ListNode;
import edu.princeton.cs.algs4.StdOut;

public class Utils {

  public static ListNode createLinkedList(int... values) {
    ListNode head = null;
    ListNode t = null;
    for (int value : values) {
      if (t == null) {
        t = new ListNode(value);
        head = t;
      } else {
        t.next = new ListNode(value);
        t = t.next;
      }
    }
    return head;
  }

  public static void printLinkedList(ListNode head) {
    for (ListNode t = head; t != null; t = t.next) {
      StdOut.print(head.val + "\t");
    }
  }
}
