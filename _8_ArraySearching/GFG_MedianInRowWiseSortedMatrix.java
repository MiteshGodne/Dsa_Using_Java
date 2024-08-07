package _8_ArraySearching;

public class GFG_MedianInRowWiseSortedMatrix {
  public static int medianInSortedRowMatrix(int matrix[][], int r, int c) {
    int n = r * c, medianIdx = n / 2;
    int start = 1, end = 2000;
    while (start <= end) {
      int assumedMedianIdx = start + (end - start) / 2;
      // find no of element less than assumedMedianIdx
      int smallerElements = findNoOfSmallerElements(matrix, assumedMedianIdx);
      if (smallerElements <= medianIdx) {
        start = assumedMedianIdx + 1;
      } else {
        end = assumedMedianIdx - 1;
      }
    }
    return start;
  }

  public static int findNoOfSmallerElements(int[][] matrix, int assumedMedianIdx) {
    int noOfSmallerElements = 0;
    // traverse row by row
    for (int i = 0; i < matrix.length; i++) {
      // apply binary search on each row
      int start = 0, end = matrix[i].length - 1;
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (matrix[i][mid] <= assumedMedianIdx) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
      // start index is equal to no of elements smaller than assumedMedianIdx
      noOfSmallerElements += start;
    }
    return noOfSmallerElements;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
    int median = medianInSortedRowMatrix(matrix, 3, 3);
    System.out.println("Median Of Sorted Row Matrix : " + median);
  }
}
