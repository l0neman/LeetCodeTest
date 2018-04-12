package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class LinkedListCycle {
  public boolean hasCrycle(ListNode head) {
    if(head == null || head.next != null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head;
    slow = slow.next;
    fast = fast.next.next;
    while (fast != null && fast.next != null) {
      if(slow == fast) {
        return true;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return false;
  }
}
