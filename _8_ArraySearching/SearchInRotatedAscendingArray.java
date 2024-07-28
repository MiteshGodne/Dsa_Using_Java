package _8_ArraySearching;

import java.util.Scanner;

public class SearchInRotatedAscendingArray {
  public static int searchInRotated(int arr[], int target) {
    int index = -1, start = 0, mid, end = arr.length - 1;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (target == arr[mid]) {
        return mid;
      }
      // If Right side of mid index is sorted
      else if (arr[mid] < arr[start]) {
        if (target > arr[mid] && target <= arr[end]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
      // If Left side of mid index is sorted
      else {
        if (target < arr[mid] && target >= arr[start]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int arr[] = { 3,1 };
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a target element to search in a Rotated Sorted Array : ");
      int target = sc.nextInt();
      int index = searchInRotated(arr, target);
      if (index > 0) {
        System.out.printf("\n>> Element %d found at index : %d \n", target, index);
      } else {
        System.out.println("\n>>Element not found in the array.");
      }
    }
  }
}
