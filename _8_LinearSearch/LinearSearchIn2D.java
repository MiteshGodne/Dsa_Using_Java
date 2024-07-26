package _8_LinearSearch;

import java.util.Scanner;

import _7_TwoDArray.TwoDArrayUtility;

public class LinearSearchIn2D {
  public static void linearSingleOccurrenceIn2D(int[][] arr, int target, boolean findLast) {
    int inner = -1, outer = -1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (target == arr[i][j]) {
          if (findLast == true) {
            outer = i;
            inner = j;
          } else {
            System.out.printf("\nElement's first occurrence is at index : Array [ %d ][ %d ]\n", outer, inner);
            return;
          }
        }
      }
    }
    TwoDArrayUtility.print2DIntArray(arr);
    if (inner != -1) {
      System.out.printf("Element's last occurrence is at index : Array [ %d ][ %d ]\n", outer, inner);
    } else {
      System.out.print("\nElement Not Found !!\n");
    }
  }

  public static void main(String[] args) {
    int arr[][] = TwoDArrayUtility.input2DIntArray();

    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the target element you want to search : ");
      int target = sc.nextInt();

      System.out.print("\nEnter Y/y if you want the last occurrence of target : ");
      char last = sc.next().charAt(0);
      boolean findLast = false;

      if (last == 'Y' || last == 'y') {
        findLast = true;
      }

      linearSingleOccurrenceIn2D(arr, target, findLast);
    }

  }
}
