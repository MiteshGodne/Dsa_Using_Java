package _8_ArraySearching;

import java.util.Scanner;
import _6_Arrays.ArrayUtility;

public class NoOfOccurrencesByBinarySearch {
  // Number of occurrences = Last Occurrence - First Occurrence + 1;
  public static int allOccurrencesByBinarySearch(int arr[], int target) {
    int firstOcc = -1, lastOcc = -1, start = 0, end = arr.length - 1, mid;

    // Loop to get the first occurrence
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        firstOcc = mid;
        end = mid - 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    // Loop to get the last occurrence
    start = 0;
    end = arr.length - 1;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        lastOcc = mid;
        start = mid + 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return lastOcc - firstOcc + 1;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the array size : ");
      int size = sc.nextInt();

      System.out.println(
          "\nEnter the array elements in increasing order only as this program runs on Binary Search Algorithm - ");
      int arr[] = ArrayUtility.inputIntArray(size);

      System.out.print("\nEnter the target element to search : ");
      int target = sc.nextInt();

      int occurrences = allOccurrencesByBinarySearch(arr, target);
      if (occurrences > 0) {
        System.out.printf("\nElement '%d' is occurred '%d' consecutive times in the array.", target, occurrences);
      } else {
        System.out.print("\nElement is not present in the array.");
      }
    } catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!");
    }
  }
}
