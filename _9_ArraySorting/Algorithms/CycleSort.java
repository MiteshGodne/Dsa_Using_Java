package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class CycleSort {

  public static void main(String[] args) {
    int arr[] = { 2, 3, 0, 6, 0, 6, 4, 7 };
    cycleSortWithDuplicates(arr);
    System.out.println("\nArray after Cycle Sort becomes - ");
    ArrayUtility.printIntegerArray(arr);
  }

  // Time Complexity : O((n-2)*(n-1)) == O(n^2)

  public static void cycleSortWithDuplicates(int[] arr) {
    int n = arr.length;

    for (int cycles = 0; cycles < n - 1; cycles++) {
      int item = arr[cycles];
      int pos = cycles;

      // find number of smaller elements right to pos
      for (int i = cycles + 1; i < n; i++) {
        if (arr[i] < item) {
          pos++;
        }
      }

      // if pos == cycles, then element is at correct position
      if (pos == cycles) {
        continue;
      }

      // ignore duplicates of items
      while (arr[pos] == item) {
        pos++;
      }

      // if smaller elements found, then swap
      if (pos != cycles) {
        int temp = arr[pos];
        arr[pos] = item;
        item = temp;
      }

      // check if more swaps are required
      while (pos != cycles) {
        pos = cycles; // restoring the pos

        // find number of smaller elements right to pos
        for (int i = cycles + 1; i < n; i++) {
          if (arr[i] < item) {
            pos++;
          }
        }

        // ignore duplicates of items
        while (arr[pos] == item) {
          pos++;
        }

        // swap
        if (item != arr[pos]) {
          int temp = arr[pos];
          arr[pos] = item;
          item = temp;
        }
      }
    }
  }

}
