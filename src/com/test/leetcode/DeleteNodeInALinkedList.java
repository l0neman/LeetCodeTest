package com.test.leetcode;

import com.test.leetcode.bean.ListNode;

public class DeleteNodeInALinkedList {
  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
