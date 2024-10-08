package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class RadixSort {

  // Time Complexity : O(n) + O(maxDigits(n + k)) == O(noOfMaxDigits(n+k))
  // Space Complexity : O(k) + O(n)

  public static void radixSortAsc(int[] arr) {
    int n = arr.length;
    int max = arr[0];

    // Loop to find Max element of the array
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    // If array has negative elements
    if (max < 0) {
      System.out.println("Negative values are not allowed !!");
      return;
    }

    for (int digit = 1; max / digit > 0; digit *= 10) {
      countingSortOnDigit(arr, digit);
    }
  }

  public static void countingSortOnDigit(int[] arr, int digit) {
    int n = arr.length;
    int k = 9; // max possible value of a digit

    int sortedArr[] = new int[n];
    int freqCount[] = new int[k + 1];

    // Loop to find frequency of every element
    for (int i = 0; i < n; i++) {
      int value = arr[i] / digit; // to get the single digit
      int index = value % 10;
      freqCount[index] += 1;
    }

    // Loop to find cumulative frequency
    for (int i = 1; i <= k; i++) {
      freqCount[i] += freqCount[i - 1];
    }
    // Putting values into sortedArray.
    for (int i = n - 1; i >= 0; i--) {
      int value = arr[i] / digit;
      int placeDigit = value % 10;
      int index = --freqCount[placeDigit];
      sortedArr[index] = arr[i];
    }

    // copy back to original array
    for (int j = 0; j < sortedArr.length; j++) {
      arr[j] = sortedArr[j];
    }
  }

  public static void main(String[] args) {
    // int[] arr = ArrayUtility.inputIntArray(6);
    int arr[] = { 202, 1, 42, 302, 34, 101 };
    radixSortAsc(arr);
    System.out.println("\nArray after Ascending Radix Sort becomes - ");
    ArrayUtility.printIntegerArray(arr);
  }
}
