package _7_TwoDArray;

import java.util.Scanner;

public class TwoDArrayUtility {
  public static int[][] input2DIntArray() {
    int rows, cols;
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
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
      return arr;
  }

  public static void print2DIntArray(int[][] arr) {
    for (int r = 0; r < arr.length; r++) {
      for (int c = 0; c < arr[r].length; c++) {
        if (c == (arr[r].length - 1)) {
          System.out.print(arr[r][c] + "  ");
        }else{
          System.out.print(arr[r][c] + " , ");
        }
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] arr = input2DIntArray();
    System.out.println("\n2D array is :- ");
    print2DIntArray(arr);
  }
}