package _9_ArraySearching.Algorithms;

import _6_Arrays.ArrayUtility;

public class Brick_Parity_OddEvenSort {

  // Time Complexity : O(n^2)

  public static void brickSortAsc(int[] arr) {
    boolean isSorted = false;
    int n = arr.length;
    while (!isSorted) { // isSorted == false
      // even index swapping
      boolean flag = false;
      for (int i = 0; i <= n - 2; i += 2) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
      // odd index swapping
      for (int i = 1; i <= n - 2; i += 2) {
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
      // If no swaps occurred at any phases, then array is sorted & hence break
      if (!flag) {
        isSorted = true;
      }
    }
  }

  public static void brickSortDesc(int[] arr) {
    boolean isSorted = false;
    int n = arr.length;
    while (!isSorted) { // isSorted == false
      // even index swapping
      boolean flag = false;
      for (int i = n - 2; i >= 0; i -= 2) {
        if (arr[i] < arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
      // odd index swapping
      for (int i = n - 3; i >= 0; i -= 2) {
        if (arr[i] < arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
      // If no swaps occurred at any phases, then array is sorted & hence break
      if (!flag) {
        isSorted = true;
      }
    }
  }

  public static void main(String[] args) {
    try {
      int[] arr = ArrayUtility.inputIntArray(6);
      brickSortAsc(arr);
      System.out.println("\nArray after Ascending brick Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);

      brickSortDesc(arr);
      System.out.println("\nArray after Descending brick Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);
    } catch (Exception e) {
      System.out.println("\nException Occurred : " + e);
    }
  }
}