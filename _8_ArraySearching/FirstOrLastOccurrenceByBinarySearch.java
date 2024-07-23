package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class FirstOrLastOccurrenceByBinarySearch {
  // This algorithm works on array sorted in ascending order.
  public static int firstOrLastOccurrenceByBinarySearch(int arr[], int target, boolean isFirst) {
    int index = -1, start = 0, end = arr.length - 1, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        index = mid;
        if (isFirst) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else if (arr[mid] < target) {
        start = mid + 1;
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

      System.out.print(
          "\nEnter the array elements in increasing order only as this program runs on Binary Search Algorithm - \n");
      int arr[] = ArrayUtility.inputIntArray(size);

      System.out.print("\nEnter the target element to search : ");
      int target = sc.nextInt();

      System.out.print("\nEnter 'true' to find first occurrence and 'false' to find the last occurrence : ");
      boolean isFirst = sc.nextBoolean();

      int index = firstOrLastOccurrenceByBinarySearch(arr, target, isFirst);
      if (index >= 0 && isFirst == true) {
        System.out.printf("\nElement's first occurrence is at index '%d'", index);
      } else if (index >= 0 && isFirst == false) {
        System.out.printf("\nElement's last occurrence is at index '%d'", index);
      } else {
        System.out.print("\nElement not found in the array.");
      }
    }
    catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!");
    }
  }
}
