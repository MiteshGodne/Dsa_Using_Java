package _9_ArraySorting.Algorithms;

import _6_Arrays.ArrayUtility;

public class InsertionSort {
  // Time Complexity : O(n^2)

  public static void insertionSortAsc(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i], j = i - 1;
      // Shift arr[j] to arr[j+1] till key is smaller than its previous element
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      // after key becomes larger or j goes below 0, place the key to j+1
      arr[j + 1] = key;
    }
  }

  public static void insertionSortDesc(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i], j = i - 1;
      // Shift arr[j] to arr[j+1] till key is larger than its previous elements
      while (j >= 0 && arr[j] < key) {
        arr[j + 1] = arr[j];
        j--;
      }
      // after key becomes smaller or j goes below 0, place the key to j+1
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    try {
      int[] arr = ArrayUtility.inputIntArray(6);
      insertionSortAsc(arr);
      System.out.println("\nArray after Ascending Insertion Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);
      insertionSortDesc(arr);
      System.out.println("\nArray after Descending Insertion Sort becomes - ");
      ArrayUtility.printIntegerArray(arr);
    } catch (Exception e) {
      System.out.println("Error Or Invalid Input !!\nDetails :  " + e);
    }
  }
}