package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class MinDifFromTargetByBinarySearch {

  public static int minAbsoluteDiff(int[] arr, int target) {
    int index = 0, start = 0, end = arr.length - 1, mid, diff = Integer.MAX_VALUE;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        start = mid + 1;
        if (diff > Math.abs(arr[mid] - target)) {
          index = mid;
        }
      } else {
        end = mid - 1;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the array size : ");
      int size = sc.nextInt();

      System.out.println(
          "\nNote - Enter the array elements in increasing order only as this program runs on Binary Search Algorithm - \n");
      int arr[] = ArrayUtility.inputIntArray(size);

      System.out.print(
          "\nEnter the target element to search it's minimum absolute difference with an element, the element and its index from the array : ");
      int target = sc.nextInt();

      int index = minAbsoluteDiff(arr, target);
      if (size == 0) {
        System.out.printf("\nArray is empty hence the difference is equal to the element itself i.e. ' %d '.\n",
            target);
      } else {
        System.out.printf(
            "\nMinimum Absolute Difference is ' %d ' for the target element and element ' %d ' present at index ' %d ' \n",
            Math.abs(arr[index] - target), arr[index], index);
      }
    } catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!");
    }
  }
}
