package _8_ArraySearching;

public class LeetCode589_KthSmallestElementInMatrix {
  public static int kthSmallestElementInMatrix(int matrix[][], int k) {
    int n = matrix.length;
    int start = matrix[0][0], end = matrix[n - 1][n - 1];
    // applying binary search on matrix to find assumedAns (index of kth element)
    while (start <= end) {
      int assumedAns = start + (end - start) / 2;
      int noOfSmallerElements = findNoOfSmallerElements(matrix, assumedAns);
      if (noOfSmallerElements <= k - 1) {
        start = assumedAns + 1;
      } else {
        end = assumedAns - 1;
      }
    }
    return start;
  }

  public static int findNoOfSmallerElements(int[][] matrix, int assumedAns) {
    // traverse every row to find no. of smaller elements
    int noOfSmallerElements = 0;
    for (int i = 0; i < matrix.length; i++) {
      int start = 0, end = matrix[i].length - 1;
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (matrix[i][mid] <= assumedAns) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
      // sum start indices as start denotes no of smaller elements to get total
      noOfSmallerElements += start;
    }
    return noOfSmallerElements;
  }

  public static void main(String[] args) {
    int matrix[][] = { {-5}};
    int kthElement = kthSmallestElementInMatrix(matrix, 1);
    System.out.println("kth Element Of Sorted Row Matrix : " + kthElement);
  }
}
