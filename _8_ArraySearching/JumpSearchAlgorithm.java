package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

// TC = O(sqrt(n))
public class JumpSearchAlgorithm {
  public static int jumpSearchForInteger(int arr[], int target) {
    int index = -1, start = 0, blockSize = (int) Math.sqrt(arr.length), end = blockSize;
    while (end < arr.length && arr[end] <= target) {
      start = end;
      end += blockSize;
      if (end > arr.length)
        end = arr.length;
    }
    for (int i = start; i < end; i++) {
      if (arr[i] == target) {
        return i;
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

      int index = jumpSearchForInteger(arr, target);
      if (index >= 0) {
        System.out.println("Element found at index : " + index);
      } else {
        System.out.println("Element not found !!");
      }
    } catch (Exception e) {
      System.out.println("Input Error !!\nDetails : " + e);
    }
  }
}
