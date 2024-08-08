package _8_ArraySearching;

public class LeetCode74_SearchInSortedMatrix {
  public static int[] searchInSortedMatrix(int matrix[][], int target) {
    int index[] = { -1, -1 };
    int n = matrix.length, m = matrix[0].length, totalElements = m * n;
    if(m == 0){
      return index;
    }
    int start = 0, end = totalElements - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (matrix[mid / m][mid % m] == target) {
        index[0] = mid / m;
        index[1] = mid % m;
        return index;
      } else if (matrix[mid / m][mid % m] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return index;
  }

  public static void main(String[] args) {
    int matrix[][] = { { 2, 3 } };
    int[] index = searchInSortedMatrix(matrix, 8);
    if (index[0] >= 0) {
      System.out.println("Index of target element : matrix [ " + index[0] + " ][ " + index[1] + " ]");
    } else {
      System.out.println("Element not found !!");
    }
  }
}
