package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class CycleSortForNonDuplicates {

  // Time Complexity : O(n)
  public static void cycleSortOneToN(int[] arr) {
    int idx = 0, actualPos, n = arr.length;
    while (idx < n) {
      int element = arr[idx];
      actualPos = element - 1; // mapping ---> element = idx + 1;
      if (arr[idx] < n && arr[idx] != arr[actualPos]) {
        swap(arr, idx, actualPos);
      } else {
        idx++;
      }
    }
  }

  public static void cycleSortZeroToN(int[] arr) {
    int idx = 0, actualPos, n = arr.length;
    while (idx < n) {
      int element = arr[idx];
      actualPos = element; // mapping ---> element = idx;
      if (arr[idx] < n && arr[idx] != arr[actualPos]) {
        swap(arr, idx, actualPos);
      } else {
        idx++;
      }
    }
  }

  public static void swap(int[] arr, int idx1, int idx2) {
    int temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 0, 6, 0, 6, 4, 7 };
    cycleSortZeroToN(arr);
    System.out.println("\nArray after Cycle Sort becomes - ");
    ArrayUtility.printIntegerArray(arr);
  }
}