package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class RemoveNthNodeFromEndOfList {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode fast = head;
    ListNode slow = head;
    int i = 0;
    for (; i < n + 1 && fast != null; i++) {
      fast = fast.next;
    }
    if (i == n + 1) {
      while (fast != null) {
        slow = slow.next;
        fast = fast.next;
      }
      ListNode t = slow.next;
      slow.next = slow.next.next;
      t.next = null;
    }
    if (fast == null && i == n) {
      /* head node */
      ListNode t = head;
      head = head.next;
      t.next = null;
    }
    return head;
  }
}
