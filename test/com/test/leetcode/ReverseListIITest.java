package com.test.leetcode;

import com.test.leetcode.bean.ListNode;
import org.junit.Test;

public class ReverseListIITest {

  @Test
  public void reverseBetween() {
    ListNode l0 = new ListNode(1);
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(3);
    ListNode l3 = new ListNode(4);
    ListNode l4 = new ListNode(5);

    l0.next = l1;
    l1.next = l2;
    l2.next = l3;
    l3.next = l4;

    final ListNode listNode = new ReverseListII().reverseBetween(
        l0, 2, 4
    );
  }
}