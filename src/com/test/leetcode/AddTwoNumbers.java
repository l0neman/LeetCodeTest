package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = l1;
    ListNode t1 = l1;
    ListNode t2 = l2;
    while (t1 != null) {
      t1.val += t2 == null ? 0 : t2.val;
      if (t1.next == null && t2 != null) {
        t1.next = t2.next;
        t2.next = null;
      }
      if (t1.val >= 10) {
        t1.val -= 10;

        if (t1.next == null) {
          t1.next = new ListNode(1);
          return head;
        }
        t1.next.val++;
      }
      t1 = t1.next;
      t2 = t2 == null ? null : t2.next;
    }
    return head;
  }
}
