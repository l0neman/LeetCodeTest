package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class PalindromeLinkedList {

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return false;
    }
    if (head.next == null) {
      return true;
    }
    ListNode slow = head;
    ListNode fast = head;
    for (;;) {
      if (fast == null) {
        break;
      }
      if (fast.next == null) {
        slow = slow.next;
        break;
      }
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode h2 = reverseList(slow);
    while(head != null && h2 != null) {
      if(head.val != h2.val) {
        return false;
      }
      head = head.next;
      h2 = h2.next;
    }
    return true;
  }

  private static ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode n = head;
    ListNode next = null;
    while (n != null) {
      next = n.next;
      n.next = prev;
      prev = n;
      n = next;
    }
    return prev;
  }
}
