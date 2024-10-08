package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class CountingSort {

  // good Time Complexity : O(n + k)
  // poor Space Complexity : O(k) + O(n)

  public static int[] countSortAsc(int[] arr) {
    int n = arr.length;
    int k = arr[0];
    int sortedArr[] = new int[n];

    // Loop to find Max element of the array
    for (int i = 0; i < n; i++) {
      if (k < arr[i]) {
        k = arr[i];
      }
    }

    // If array has negative elements
    if (k < 0) {
      System.out.println("Negative values are not allowed !!");
      return sortedArr;
    }

    int freqCount[] = new int[k + 1];
    // Loop to find frequency of every element
    for (int i = 0; i < n; i++) {
      freqCount[arr[i]] += 1;
    }

    // Loop to find cumulative frequency
    for (int i = 1; i <= k; i++) {
      freqCount[i] += freqCount[i - 1];
    }

    // Putting values into sortedArray.
    for (int i = n - 1; i >= 0; i--) {
      int value = arr[i];
      int index = --freqCount[value];
      sortedArr[index] = value;
    }

    return sortedArr;
  }

  public static void main(String[] args) {
    try {

      int[] arr = ArrayUtility.inputIntArray(6);
      int sortedArr[] = countSortAsc(arr);
      System.out.println("\nArray after Ascending count Sort becomes - ");
      ArrayUtility.printIntegerArray(sortedArr);

    } catch (Exception e) {
      System.out.println("\nException Occurred : " + e);
    }
  }
}
