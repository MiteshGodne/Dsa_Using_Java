package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class SelectionSort {
  // Time Complexity : O(n^2)

  public static void unidirectionalAscSelectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int min = arr[i], j = i + 1, minIdx = i;
      // find min element in array from index j = i+1 till arr.length
      while (j < arr.length) {
        if (min > arr[j]) {
          min = arr[j];
          minIdx = j;
        }
        j++;
      }
      // swap arr[i] with min[i]
      arr[minIdx] = arr[i];
      arr[i] = min;
    }
  }

  public static void bidirectionalAscSelectionSort(int[] arr) {
    int n = arr.length;
    int k = n - 1;
    for (int i = 0; i < k; i++) {
      int min = arr[i], minIdx = i;
      int max = arr[i], maxIdx = i;
      // find min and max element in array from index j = i+1 till arr.length
      for (int j = i + 1; j <= k; j++) {
        if (min > arr[j]) {
          min = arr[j];
          minIdx = j;
        }
        if (max < arr[j]) {
          max = arr[j];
          maxIdx = j;
        }
      }
      // swap arr[i] with arr[minIdx]
      arr[minIdx] = arr[i];
      arr[i] = min;
      // swap arr[k] with max but if min and max got swapped
      if (max == arr[minIdx]) {
        // swap arr[k] with min
        arr[minIdx] = arr[k];
        arr[k] = min;
      } else {
        // swap arr[k] with max
        arr[maxIdx] = arr[k];
        arr[k] = max;
      }
      // after swapping max to last, reduce k
      k--;
    }
  }

  public static void bidirectionalDescSelectionSort(int[] arr) {
    int n = arr.length;
    int k = n - 1;
    for (int i = 0; i < k; i++) {
      int min = arr[i], minIdx = i;
      int max = arr[i], maxIdx = i;

      for (int j = i + 1; j <= k; j++) {
        if (min > arr[j]) {
          min = arr[j];
          minIdx = j;
        } else if (max < arr[j]) {
          max = arr[j];
          maxIdx = j;
        }
      }

      // swap max with arr[i]
      arr[maxIdx] = arr[i];
      arr[i] = max;

      if (max == arr[minIdx]) {
      } else {
        // swap min with arr[k]
        arr[minIdx] = arr[k];
        arr[k] = min;
      }

      k--;
    }
  }

  public static void main(String[] args) {

    try {
      int[] arr = ArrayUtility.inputIntArray(7);

      unidirectionalAscSelectionSort(arr);
      System.out.println("\nArray after Unidirectional Ascending selection Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);

      bidirectionalDescSelectionSort(arr);
      System.out.println("\nArray after Bidirectional Descending selection Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);

      bidirectionalAscSelectionSort(arr);
      System.out.println("\nArray after Bidirectional Ascending selection Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);
    } catch (Exception e) {
      System.out.println("Error Or Invalid Input !!\nDetails :  " + e);
    }

  }
}