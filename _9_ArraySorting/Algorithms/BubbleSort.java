package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class BubbleSort {

  // Time Complexity : O(n^2)

  public static void bubbleSortAsc(int[] arr) {
    int n = arr.length;
    for (int passCount = 0; passCount <= n - 2; passCount++) {
      boolean flag = false;
      for (int i = 0; i <= n - 2 - passCount; i++) {
        // Swap to push largest element to the n-1 index
        if (arr[i] > arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
      // If no swaps occurred at any pass, then array becomes sorted & hence break
      if (!flag) {
        break;
      }
    }
  }

  public static void bubbleSortDesc(int[] arr) {
    int n = arr.length;
    for (int passCount = 0; passCount < n; passCount++) {
      boolean flag = false;
      for (int i = n - 2; i >= 0; i--) {
        // Swap to push largest element to the 0 index
        if (arr[i] < arr[i + 1]) {
          int temp = arr[i];
          arr[i] = arr[i + 1];
          arr[i + 1] = temp;
          flag = true;
        }
      }
      // If no swaps occurred at any pass, then array becomes sorted & hence break
      if (!flag) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    try {
      int[] arr = ArrayUtility.inputIntArray(6);
      bubbleSortAsc(arr);
      System.out.println("\nArray after Ascending bubble Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);

      bubbleSortDesc(arr);
      System.out.println("\nArray after Descending bubble Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);
    } catch (Exception e) {
      System.out.println("\nException Occurred : " + e);
    }
  }
}