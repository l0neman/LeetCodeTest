package com.test.leetcode;

import com.test.leetcode.bean.ListNode;
import org.junit.Test;

public class LinkedListCycleIITest {

  @Test
  public void detectCycle() {
    ListNode l0 = new ListNode(3);
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(0);
    ListNode l3 = new ListNode(-4);

    l0.next = l1;
    l1.next = l2;
    l2.next = l3;
    l3.next = l1;

    ListNode n = new LinkedListCycleII().detectCycle(l0);
    System.out.println(n.val);
  }
}