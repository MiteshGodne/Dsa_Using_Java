package _8_ArraySearching;

import _7_TwoDArray.TwoDArrayUtility;

public class GFGLeetCode48_RotateImageMatrix {
  // LeetCode 48 : 90 deg clockwise rotation
  public static int[][] rotateMatrixClockwise(int[][] matrix) {
    int n = matrix.length;
    // transpose the matrix -
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // after transpose, swap all (j)th cols with (n-j-1)th cols
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - j - 1];
        matrix[i][n - j - 1] = temp;
      }
    }
    return matrix;
  }


  // GFG - Rotate by 90 deg
  public static int[][] rotateMatrixAntiClockwise(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    // after transpose, swap (i)th rows with (n-i-1)th rows
    for (int i = 0; i < n /2; i++) {
      for (int j = 0; j < n ; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - i - 1][j];
        matrix[n - i - 1][j] = temp;
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
    int[][] matrix1 = {
        { 1, 1, 1, 1 },
        { 2, 2, 2, 2 },
        { 3, 3, 3, 3 },
        { 4, 4, 4, 4 } };

    int[][] clockwise = rotateMatrixClockwise(matrix);
    System.out.println("90 Degree Clockwise Rotated matrix is :- ");
    TwoDArrayUtility.print2DIntArray(clockwise);

    int[][] antiClockwise = rotateMatrixAntiClockwise(matrix1);
    System.out.println("90 Degree Anti-Clockwise Rotated matrix is :- ");
    TwoDArrayUtility.print2DIntArray(antiClockwise);
  }
}
