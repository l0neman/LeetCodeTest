package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
    ListNode n = head;
    ListNode prev = null;
    ListNode next = null;
    while (n != null) {
      next = n.next;
      n.next = prev;
      prev = n;
      n = next;
    }
    return prev;
  }

  public ListNode reverseList2(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode newHead = reverseList2(head.next);
    head.next.next = head;
    head.next = null;
    return newHead;
  }
}
