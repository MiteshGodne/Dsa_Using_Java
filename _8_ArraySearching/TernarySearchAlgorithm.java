package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class TernarySearchAlgorithm {

  public static int ternarySearchForInteger(int arr[], int target) {
    int index = -1, start = 0, end = arr.length - 1;

    while (start <= end) {
      int mid1 = start + (end - start) / 3;
      int mid2 = end - (end - start) / 3;

      if (target <= arr[mid1]) {
        if (target == arr[mid1]) {
          index = mid1;
          break;
        }
        end = mid1 - 1;
      } else if (target >= arr[mid2]) {
        if (target == arr[mid2]) {
          index = mid2;
          break;
        }
        start = mid2 + 1;
      } else {
        start = mid1 + 1;
        end = mid2 - 1;
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

      int index = ternarySearchForInteger(arr, target);
      if (index >= 0) {
        System.out.println("\n>> Element found at index : " + index);
      } else {
        System.out.println("\n>> Element not found !!");
      }
    } catch (Exception e) {
      System.out.println("\n>> Error !!\nDetails : " + e);
    }
  }
}
