package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class MaxAndMinOfIntArray {
  public static int maxFromIntArray(int[] arr) {
    int max = arr[0];
    for (int ele : arr) {
      if (max < ele) {
        max = ele;
      }
    }
    return max;
  }

  public static int minFromIntArray(int[] arr) {
    int min = arr[0];
    for (int ele : arr) {
      if (min > ele) {
        min = ele;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the array size : ");
      int size = scanner.nextInt();

      int array[] = ArrayUtility.inputIntArray(size);

      int maximum = maxFromIntArray(array);
      System.out.printf("\n>> Maximum number present in the array is : %d ", maximum);
      int minimum = minFromIntArray(array);
      System.out.printf("\n>> Minimum number present in the array is : %d ", minimum);

    } catch (Exception e) {
      System.out.println("\n Error >> Invalid Input !!\n");
    }
  }
}