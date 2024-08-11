package _8_ArraySearching;

import _7_TwoDArray.TwoDArrayUtility;

public class LeetCode59_SpiralMatrix_2 {
  // Fill the values in a matrix(n*n) in spiral order
  public static int[][] fillMatrixInSpiralOrder(int n) {
    int[][] matrix = new int[n][n];
    int startRow = 0, startCol = 0;
    int endRow = n - 1, endCol = n - 1;
    int val = 0;

    while (startRow <= endRow && startCol <= endCol) {
      // Fill First Row
      for (int j = startCol; j <= endCol; j++) {
        val += 1;
        matrix[startRow][j] = val;
      }
      startRow += 1;

      // Fill Last Column
      for (int i = startRow; i <= endRow; i++) {
        val += 1;
        matrix[i][endCol] = val;
      }
      endCol -= 1;

      // Fill Last Row
      if (startRow <= endRow) {
        for (int j = endCol; j >= startCol; j--) {
          val += 1;
          matrix[endRow][j] = val;
        }
      }
      endRow -= 1;

      // Fill First Column
      if (startCol <= endCol) {
        for (int i = endRow; i >= startRow; i--) {
          val += 1;
          matrix[i][startCol] = val;
        }
      }
      startCol += 1;
    }
    return matrix;
  }

  public static void main(String[] args) {
    int[][] matrix = fillMatrixInSpiralOrder(4);
    TwoDArrayUtility.print2DIntArray(matrix);
  }
}
