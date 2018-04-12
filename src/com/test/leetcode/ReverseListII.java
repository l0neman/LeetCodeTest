package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class ReverseListII {

  public ListNode reverseBetween(ListNode head, int m, int n) {
    if(m == 1) {
      return reverseList(head, m - n);
    }
    ListNode curr = head;
    ListNode prev = null;
    for (int i = 1; i < m; i++) {
      prev = curr;
      curr = curr.next;
    }
    if(prev != null) {
      prev.next = reverseList(curr, m - n + 1);
    }
    return head;
  }

  // 将链表的前 l 个节点反转
  private ListNode reverseList(ListNode head, int l) {
    ListNode n = head;
    ListNode prev = null;
    ListNode next = null;
    for (int i = 0; i < l; i++) {
      next = n.next;
      n.next = prev;
      prev = n;
      n = next;
    }
    head.next = next;
    return prev;
  }
}
