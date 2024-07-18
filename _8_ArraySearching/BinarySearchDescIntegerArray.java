package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class BinarySearchDescIntegerArray {

  // ( start + end ) / 2 == start + ((end - start) / 2))
  static int binarySearchIntegerArray(int arr[], int target) {
    int start = 0, end = arr.length - 1, mid;
    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the array size : ");
      int size = sc.nextInt();
      System.out.println(
          "\nPlease enter the array elements in decreasing order only as this program runs on Binary Search Algorithm - ");
      int arr[] = ArrayUtility.inputIntArray(size);
      System.out.print("Enter the target element to search : ");
      int target = sc.nextInt();
      int index = binarySearchIntegerArray(arr, target);

      if (index < 0) {
        System.out.println("\n>> Element is not present in the array.");
      } else {
        System.out.printf("\n>> Element found at index %d", index);
      }
    } catch (Exception e) {
      System.out.println("\nError >> Invalid Input !!");
    }
  }
}
