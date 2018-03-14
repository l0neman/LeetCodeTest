package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class MergeKSortedList {

  public ListNode mergeKLists(ListNode[] lists) {
    int interval = 1;
    while (interval < lists.length) {
      for (int i = 0; i < lists.length - interval; i += interval * 2) {
        lists[i] = merge2List(lists[i], lists[i + interval]);
        interval *= 2;
      }
    }

    if (lists.length == 0) {
      return null;
    }
    return lists[0];
  }

  private ListNode merge2List(ListNode l1, ListNode l2) {
    ListNode preHead = new ListNode(0);
    ListNode link = preHead;

    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        link.next = l1;
        l1 = l1.next;
      } else {
        link.next = l2;
        l2 = l2.next;
      }
    }

    if (l1 == null) {
      link.next = l2;
    } else {
      link.next = l1;
    }
    return preHead.next;
  }
}
