package com.test.leetcode;

import com.test.leetcode.bean.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorderTraversal {

  /**
   * 递归
   */
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    inorderTraversal(result, root);
    return result;
  }

  private static void inorderTraversal(List<Integer> list, TreeNode root) {
    if (root == null) { return; }

    inorderTraversal(list, root.left);
    list.add(root.val);
    inorderTraversal(list, root.right);
  }

  /**
   * 迭代
   */
  public List<Integer> inorderTraversal2(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    LinkedList<TreeNode> stack = new LinkedList<>();
    TreeNode node = root;
    while (!stack.isEmpty() || node != null) {
      while (node != null) {
        stack.push(node);
        node = node.left;
      }
      node = stack.pop();
      result.add(node.val);
      node = node.right;
    }
    return result;
  }
}
