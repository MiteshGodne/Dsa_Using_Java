package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

// Only for uniform + sorted arrays - 
public class InterpolationSearchAlgorithm {

  public static int interpolationSearch(int arr[], int target) {
    int index = -1, proposition;
    int start = 0, end = arr.length - 1;

    while (start <= end) {
      // if array has single element or same element
      if (arr[start] == arr[end]) {
        if (arr[start] == target) {
          index = start;
        }
        break;
      }

      // Formula for interpolation
      proposition = start + (target - arr[start]) * (end - start) / (arr[end] - arr[start]);

      // In case if formula predicts index out of range acc to the progression
      if (proposition > arr.length) {
        proposition = arr.length - 1;
      }

      if (target == arr[proposition]) {
        return proposition;
      }// Extend Interpolation for non uniform array
      else if (target > arr[proposition]) {
        start = proposition + 1;
      } else {
        end = proposition - 1;
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

      int index = interpolationSearch(arr, target);
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
