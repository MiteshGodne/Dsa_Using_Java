package _8_ArraySearching;

import java.util.List;

import java.util.ArrayList;

public class LeetCode54_SpiralMatrix_1 {
  // Return the values of matrix in spiral order in a list
  public static List<Integer> spiralMatrixList(int[][] matrix) {
    int startRow = 0, startCol = 0;
    int endRow = matrix.length - 1, endCol = matrix[0].length - 1;
    List<Integer> spiralList = new ArrayList<>();

    while (startRow <= endRow && startCol <= endCol) {
      // First Row
      for (int j = startCol; j <= endCol; j++) {
        spiralList.add(matrix[startRow][j]);
      }
      ++startRow;

      // Last Column
      for (int i = startRow; i <= endRow; i++) {
        spiralList.add(matrix[i][endCol]);
      }
      --endCol;

      // Last Row
      if (startRow <= endRow) {
        for (int j = endCol; j >= startCol; j--) {
          spiralList.add(matrix[endRow][j]);
        }
      }
      --endRow;

      // First Column
      if (startCol <= endCol) {
        for (int i = endRow; i >= startRow; i--) {
          spiralList.add(matrix[i][startCol]);
        }
      }
      ++startCol;
    }
    return spiralList;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    List<Integer> spiralList = spiralMatrixList(matrix);
    for (Integer ele : spiralList) {
      System.out.print(ele + " ");
    }
  }
}
