package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class SweepNodesInPairs {

  public ListNode swapPairs(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode newHead = head.next;
    head.next = swapPairs(head.next.next);
    newHead.next = head;
    return newHead;
  }
}
