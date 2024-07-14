package _7_TwoDArray;

import java.util.Scanner;

import _6_Arrays.DeleteFromArray;

public class DeleteFrom2DArray {
  public static boolean deleteFrom2DIntArray(int[][] arr) {
    System.out.println("\nInput Deletion details -");
    int pos1, pos2;
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter the index of Root Array (Row Number) : ");
      pos1 = scan.nextInt();
      System.out.print("Enter the index of Sub Array (Column Number) : ");
      pos2 = scan.nextInt();
      if (pos1 > arr.length || pos2 > arr[pos1].length) {
        throw new Exception();
      }
    } catch (Exception e) {
      System.out.println("Error >> Invalid Deletion Input !!");
      return false;
    }
    DeleteFromArray.deleteFromArray(arr[pos1 - 1], pos2 - 1);
    return true;
  }

  public static void main(String[] args) {
    System.out.println("Input 2D Array - ");
    int rows, cols;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number of rows : ");
      rows = sc.nextInt();
      System.out.print("Enter the number of cols : ");
      cols = sc.nextInt();
      int arr[][] = new int[rows][cols];
      for (int r = 0; r < arr.length; r++) {
        for (int c = 0; c < arr[r].length; c++) {
          System.out.printf("Enter array[%d][%d] element : ", r, c);
          arr[r][c] = sc.nextInt();
        }
      }
      if (deleteFrom2DIntArray(arr)) {
        System.out.println("\nUpdated 2D array after insertion is -");
        TwoDArrayUtility.print2DIntArray(arr);
      } else {
        System.out.println("\nError >> Element is not deleted !!");
      }
    }
  }
}
