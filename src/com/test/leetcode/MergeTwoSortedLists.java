package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class MergeTwoSortedLists {
  /* 递归方式 */
  public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
    if (l1 == null) { return l2; }
    else
    if (l2 == null) { return l1; }

    ListNode head;
    if (l1.val < l2.val) {
      head = l1;
      head.next = mergeTwoLists2(l1.next, l2);
    } else {
      head = l2;
      head.next = mergeTwoLists2(l2.next, l1);
    }
    return head;
  }

  /* 循环方式 */
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) { return l2; }
    else
    if (l2 == null) { return l1; }

    ListNode head;
    if (l1.val < l2.val) {
      head = l1;
      l1 = l1.next;
    } else {
      head = l2;
      l2 = l2.next;
    }

    ListNode t = head;
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        t.next = l1;
        l1 = l1.next;
      } else {
        t.next = l2;
        l2 = l2.next;
      }
      t = t.next;
    }

    t.next = l1 == null ? l2 : l1;
    return head;
  }
}
