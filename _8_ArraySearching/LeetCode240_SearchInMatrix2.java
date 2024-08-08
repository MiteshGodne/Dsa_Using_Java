package _8_ArraySearching;

public class LeetCode240_SearchInMatrix2 {

  public static int[] searchInSortedMatrix2(int matrix[][], int target) {
    int index[] = { -1, -1 };
    int r = matrix.length, c = matrix[0].length;
    if (r == 0) {
      return index;
    }
    // start from last element of 0th row
    int currentRow = 0, currentCol = c - 1;

    // currentRow cannot be greater than given rows
    // currentCol cannot be smaller than given cols
    while (currentRow < r && currentCol >= 0) {
      if (target == matrix[currentRow][currentCol]) {
        index[0] = currentRow;
        index[1] = currentCol;
        return index;
      } else if (matrix[currentRow][currentCol] < target) {
        // moving down, skipping current row
        currentRow++;
      } else {
        // moving left, skipping current column
        currentCol--;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
        { 18, 21, 23, 26, 30 } };
    int target = 43;
    int[] index = searchInSortedMatrix2(matrix, target);
    if (index[0] >= 0 && index[1] >= 0) {
      System.out.println("Index of target element : matrix [ " + index[0] + " ][ " + index[1] + " ]");
    } else {
      System.out.println("Element not found !!");
    }
  }
}
