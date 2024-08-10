package _8_ArraySearching;

import _7_TwoDArray.TwoDArrayUtility;

public class GFG_TransposeOfMatrix {
  public static int[][] transposeOfMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < i ; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    return matrix;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 1, 1, 1 },
        { 2, 2, 2, 2 },
        { 3, 3, 3, 3 },
        { 4, 4, 4, 4 } };

    System.out.println("Transpose of the matrix is :- ");
    int[][] transpose = transposeOfMatrix(matrix);
    TwoDArrayUtility.print2DIntArray(transpose);
  }
}
