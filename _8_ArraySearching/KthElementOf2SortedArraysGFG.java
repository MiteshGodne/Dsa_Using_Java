package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class KthElementOf2SortedArraysGFG {
  public static int kthElementOfTwoArrays(int arr1[], int arr2[], int k) {
    int n1 = arr1.length, n2 = arr2.length;
    if (n1 > n2) {
      return kthElementOfTwoArrays(arr2, arr1, k);
    }

    int start = Math.max(0, k - n2), end = Math.min(k, n1);
    while (start <= end) {
      int cut1 = start + (end - start) / 2;
      int cut2 = k - cut1;
      int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
      int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
      int r1 = cut1 == n1 ? Integer.MAX_VALUE : arr1[cut1];
      int r2 = cut2 == n2 ? Integer.MAX_VALUE : arr2[cut2];

      if (l1 <= r2 && l2 <= r1) {
        return Math.max(l1, l2);
      } else {
        if (l1 > r2) {
          end = cut1 - 1;
        } else {
          start = cut1 + 1;
        }
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      //arr1[] = {100, 112, 256, 349, 770}, arr2[] = {72, 86, 113, 119, 265, 445, 892}, k = 7
      System.out.print("Enter the size of array1 and array2 respectively : ");
      int size1 = sc.nextInt();
      int size2 = sc.nextInt();
      System.out.println("Enter array 1 elements in ascending order : ");
      int nums1[] = ArrayUtility.inputIntArray(size1);
      System.out.println("Enter array 2 elements in ascending order : ");
      int nums2[] = ArrayUtility.inputIntArray(size2);
      System.out.print("Enter index k : ");
      int k = sc.nextInt();

      int kthElement = kthElementOfTwoArrays(nums1, nums2, k);
      System.out.println("kth of 2 sorted array is : " + kthElement);
    } catch (Exception e) {
      System.out.println("Invalid Input !! \nDetails : " + e);
    }
  }
}
