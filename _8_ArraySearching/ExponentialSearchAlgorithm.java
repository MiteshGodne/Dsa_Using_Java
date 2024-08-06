package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class ExponentialSearchAlgorithm {

  public static int exponentialSearchForInteger(int arr[], int target) {
    int index = -1, i = 1;
    // to start from 1 since 2*0 will remain 0 and loop will never end
    if (arr[0] == target)
      return 0;

    // enclosing target // getting end range or upper limit// skip by 2
    while (i < arr.length && arr[i] <= target) {
      i = 2 * i;
      if (i > arr.length)
        i = arr.length;
    }

    // apply binary search only on reduced range
    int start = i / 2;
    int end = Math.min(--i, arr.length);

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target)
        return mid;
      else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter array size : ");
      int size = sc.nextInt();

      System.out.println("Enter array elements in increasing order - ");
      int arr[] = ArrayUtility.inputIntArray(size);

      System.out.print("Enter target to search : ");
      int target = sc.nextInt();

      int index = exponentialSearchForInteger(arr, target);
      if (index >= 0) {
        System.out.println("\n>> Element found at index : " + index);
      } else {
        System.out.println("\n>> Element not found !!");
      }
    } catch (Exception e) {
      System.out.println("\n>> Error !!\nDetails : " + e + "\n");
    }
  }
}
