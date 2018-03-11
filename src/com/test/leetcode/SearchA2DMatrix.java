package com.test.leetcode;

public class SearchA2DMatrix {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }
    int column = 0;
    int row = matrix.length - 1;
    while (column < matrix[0].length && row >= 0) {
      if (matrix[row][column] == target) {
        return true;
      } else if (matrix[row][column] > target) {
        row--;
      } else {
        column++;
      }
    }
    return false;
  }
}
