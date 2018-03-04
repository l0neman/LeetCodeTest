package com.test.leetcode;

import com.test.leetcode.bean.TreeNode;

public class SymmetricTree {

  public boolean isSymmetric(TreeNode root) {
    return root == null || isMirror(root.left, root.right);
  }

  private static boolean isMirror(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;

    return t1 != null && t2 != null && t1.val == t2.val
        && isMirror(t1.left, t2.right)
        && isMirror(t1.right, t2.left);
  }
}
