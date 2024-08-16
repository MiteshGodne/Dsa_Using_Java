package _9_ArraySearching.Algorithms;

import _6_Arrays.ArrayUtility;

public class PigeonholeSort {

  // good Time Complexity : O(n) + O(maxDigits(n + k)) == O(noOfMaxDigits(n+k))
  // poor Space Complexity : O(k) + O(n)

  public static void pigeonholeSortAsc(int[] arr) {
    int n = arr.length;
    int max = arr[0];
    int min = arr[0];

    // Loop to find Max element of the array
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    // If array has negative elements
    if (max < 0) {
      System.out.println("Negative values are not allowed !!");
      return;
    }

    int k = max - min + 1;
    int freqCount[] = new int[k];
    for (int i = 0; i < n; i++) {
      freqCount[arr[i] - min] += 1;
    }

    int freqIdx = 0, index = 0;
    while (freqIdx < k) { // TC of this loop is O(k+n)
      if (freqCount[freqIdx] != 0) {
        arr[index] = freqIdx + min;
        index++;
        freqCount[freqIdx] -= 1;
      }
      if (freqCount[freqIdx] == 0) {
        freqIdx++;
      }
    }

  }

  public static void main(String[] args) {
    // int[] arr = ArrayUtility.inputIntArray(6);
    int arr[] = { 24, 22, 25, 22, 21, 27, 28, 20, 22 };
    pigeonholeSortAsc(arr);
    System.out.println("\nArray after Pigeonhole Sort becomes - ");
    ArrayUtility.printIntegerArray(arr);
  }
}
