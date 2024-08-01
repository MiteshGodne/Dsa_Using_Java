package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class MedianOfTwoSortedArraysBInarySearch {
  public static double medianOf2Arrays(int[] nums1, int[] nums2) {
    int n1 = nums1.length, n2 = nums2.length, N = n1 + n2;
    // we apply binary search on smaller array,
    // so if nums1 is larger, we swap their names as we assume nums1 is smaller
    if (n1 > n2) {
      return medianOf2Arrays(nums2, nums1);
    }

    int start = 0, end = n1;
    while (start <= end) {
      // mid -> cut1
      int cut1 = start + (end - start) / 2;
      // (size1+size2 - mid) -> cut2
      int cut2 = (n1 + n2) / 2 - cut1;
      // index cut1-1 ---> element l1
      int l1 = (cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1]);
      // index cut2-1 ---> element l2
      int l2 = (cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1]);
      // index cut1 ---> element r1
      int r1 = (cut1 == n1 ? Integer.MAX_VALUE : nums1[cut1]);
      // index cut2 ---> element r2
      int r2 = (cut2 == n2 ? Integer.MAX_VALUE : nums2[cut2]);

      // only one cut is valid, that passes below condition
      if (l1 <= r2 && l2 <= r1) {
        if (N % 2 == 1) {
          return (double)Math.min(r1, r2);
        } else {
          return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
        }
      } else {
        if (l1 > r2) {
          end = cut1 - 1;
        } else {
          start = cut1 + 1;
        }
      }
    }
    return 0.0;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of array1 and array2 respectively : ");
      int size1 = sc.nextInt();
      int size2 = sc.nextInt();
      System.out.println("Enter array 1 elements in ascending order : ");
      int nums1[] = ArrayUtility.inputIntArray(size1);
      System.out.println("Enter array 2 elements in ascending order : ");
      int nums2[] = ArrayUtility.inputIntArray(size2);
      double median = medianOf2Arrays(nums1, nums2);
      System.out.println("Median of 2 sorted array is : " + median);
    } catch (Exception e) {
      System.out.println("Invalid Input !! \nDetails : " + e);
    }
  }
}
