package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class LinkedListCycleII {

  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    // 判断是否为环形链表
    ListNode slow = head;
    ListNode fast = head;
    slow = slow.next;
    fast = fast.next.next;
    while (fast != null && fast.next != null) {
      if(slow == fast) {
        break;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    if (fast == null || fast.next == null) {
      return null;
    }
    // 从焦点当作头分隔链表，并计算两条链表的长度
    int l1 = 0;
    ListNode h1 = slow;
    while (h1.next != slow) {
      h1 = h1.next;
      l1++;
    }
    int l2 = 0;
    ListNode h2 = head;
    while (h2.next != slow) {
      h2 = h2.next;
      l2++;
    }
    // 根据差值
    h1 = head;
    h2 = head;
    final int offset = Math.abs(l2 - l1);
    if (l2 > l1) {
      for(int i = 0; i < offset; i++) {
        h2 = h2.next;
      }
    } else {
      for(int i = 0; i < offset; i++) {
        h1 = h1.next;
      }
    }
    // 找到链表交点
    while (h1 != h2) {
      h1 = h1.next;
      h2 = h2.next;
    }
    return h1;
  }
}
