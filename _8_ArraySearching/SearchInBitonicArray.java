package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class SearchInBitonicArray {
  public static int searchInBitonicArray(int arr[], int target) {
    int index = -1;
    int peakIndex = MinAndMaxInBitonicArray.maxElementIndexInBitonicArrayByBinarySearch(arr);
    if (peakIndex == -1 || arr[peakIndex] < target) {
      return index;
    } else {
      if (arr[peakIndex] == target) {
        return peakIndex;
      } else {
        index = BinarySearchInAscendingIntArray.binarySearchAscendingIntArray(arr, target, 0, peakIndex);
        if (index > 0) {
          return index;
        } else {
          index = BinarySearchInDescendingIntArray.binarySearchDescIntegerArray(arr, target, peakIndex + 1, arr.length - 1);
          return index;
        }
      }
    }
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the size of your Bitonic Array : ");
      int size = Math.abs(sc.nextInt());

      System.out.println(
          "\nEnter few array elements in increasing order and then in decreasing order without duplications in each half - ");
      int arr[] = ArrayUtility.inputIntArray(size);
      System.out.print(
          "\nEnter the target element to search it's minimum absolute difference with an element, the element and its index from the array : ");
      int target = sc.nextInt();

      int index = searchInBitonicArray(arr, target);
      if (index > 0)
        System.out.printf("\n Element Found at index : %d \n", index);
      else
        System.out.println("\nElement not Found in the array. \n");
    } catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!\n");
      System.out.println("Detail : " + e);
    }
  }
}
