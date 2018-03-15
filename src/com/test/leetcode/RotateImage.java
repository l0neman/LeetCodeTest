package com.test.leetcode;

public class RotateImage {

  public void rotate(int[][] matrix) {
    int half = matrix.length >> 1;
    int end = matrix.length - 1;
    int c1i, c1j;
    int c2i, c2j;
    int c3i, c3j;
    int t;
    for (int i = 0; i < half; i++, end--) {
      for (int j = i; j < end; j++) {
        c1i = j;
        c1j = matrix.length - 1 - i;
        c2i = c1j;
        c2j = matrix.length - 1 - c1i;
        c3i = c2j;
        c3j = matrix.length - 1 - c2i;

        t = matrix[i][j];
        matrix[i][j] = matrix[c3i][c3j];
        matrix[c3i][c3j] = matrix[c2i][c2j];
        matrix[c2i][c2j] = matrix[c1i][c1j];
        matrix[c1i][c1j] = t;
      }
    }
  }
}
