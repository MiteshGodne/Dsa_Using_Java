package _8_ArraySearching;

import java.util.Scanner;

public class RangeForInfiniteArray {

  public static int[] rangeOfInfiniteArray(int arr[], int target) {
    int[] range = new int[2];
    int start = 0, end = 1;

    while (arr[end] < target) {
      start = end;
      end = 2 * end;
    }

    range[0] = start;
    range[1] = end;
    return range;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      // Pseudo Infinite Array for implementation
      int[] arr = { 2, 2, 4, 5, 7, 9, 25, 56, 88, 94 };

      System.out.print("\nEnter the target element to search : ");
      int target = sc.nextInt();

      int range[] = rangeOfInfiniteArray(arr, target);

      System.out.printf(
          "\nRange of the infinite array on which we can perform our operations is between index ' %d ' to ' %d ' . ",
          range[0], range[1]);

    } catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!");
    }
  }

}
