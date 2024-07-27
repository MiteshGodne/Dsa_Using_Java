package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class MinAndMaxInBitonicArray {
  public static int minElementIndexInBitonicArray(int arr[]) {
    return (arr[0] < arr[arr.length - 1] ? 0 : arr.length - 1);
  }

  public static int maxElementIndexInBitonicArrayByLinearSearch(int arr[]) {
    int index = 0;
    for (int i = 0; i < arr.length - 1 && arr[i] < arr[i + 1]; i++) {
      index = i + 1;
    }
    return index;
  }

  public static int maxElementIndexInBitonicArrayByBinarySearch(int arr[]) {
    int index = -1, start = 0, end = arr.length - 1, prev, next, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      prev = (mid - 1 + arr.length) % arr.length;
      next = (mid + 1) % arr.length;
      if (arr[mid] > arr[prev] && arr[mid] > arr[next])
        return mid;
      else if (arr[mid] < arr[prev])
        end = mid - 1;
      else if (arr[mid] == arr[prev] || arr[mid] == arr[next])
        return mid;
      else
        start = mid + 1;
    }
    return index;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the size of your Bitonic Array : ");
      int size = Math.abs(sc.nextInt());

      System.out.println(
          "\nEnter few array elements in increasing order and then in decreasing order without duplications in each half - ");
      int arr[] = ArrayUtility.inputIntArray(size);

      if (size == 0) {
        System.out.println("No element present in the array.");
      } else {
        int minimum = minElementIndexInBitonicArray(arr);
        System.out.printf("\nElement '%d' is the smallest element, present at '%d' index. \n", arr[minimum], minimum);
        int maximumByLinear = maxElementIndexInBitonicArrayByLinearSearch(arr);
        System.out.printf("\nUsing Linear Search : Element '%d' is the largest element, present at '%d' index. \n",
            arr[maximumByLinear],
            maximumByLinear);
        int maximumByBinary = maxElementIndexInBitonicArrayByBinarySearch(arr);
        if (maximumByBinary == -1) {
          System.out.println("There is no single peak element !!");
        } else {
          System.out.printf("\nUsing Binary Search : Element '%d' is the largest element, present at '%d' index. \n",
              arr[maximumByBinary],
              maximumByBinary);
        }
      }
    } catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!\n");
      System.out.println("Details : " + e);
    }
  }
}
