package _7_TwoDArray;

import java.util.Scanner;

import _6_Arrays.UpdateIntArray;

public class Update2DArray {

  public static boolean update2DIntArray(int[][] arr) {
    System.out.println("\nInput Updation details -");
    int pos1, pos2, element;
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter the index of Root Array (Row Number) where you want to replace : ");
      pos1 = scan.nextInt();
      System.out.print("Enter the index of Sub Array (Column Number) where you want to replace : ");
      pos2 = scan.nextInt();
      if (pos1 > arr.length || pos2 > arr[pos1].length) {
        throw new Exception();
      }
      System.out.print("Enter the new element you want to update : ");
      element = scan.nextInt();
    } catch (Exception e) {
      System.out.println("Error >> Invalid Input !!");
      return false;
    }
    UpdateIntArray.updateIntArray(arr[pos1 - 1], pos2 - 1, element);
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
      if (update2DIntArray(arr)) {
        System.out.println("\nUpdated 2D array after updation is -");
        TwoDArrayUtility.print2DIntArray(arr);
      }
    }
  }
}
