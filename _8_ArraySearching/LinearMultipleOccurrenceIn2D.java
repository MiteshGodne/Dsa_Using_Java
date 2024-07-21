package _8_ArraySearching;

import java.util.Scanner;

import _7_TwoDArray.TwoDArrayUtility;

public class LinearMultipleOccurrenceIn2D {

  public static void multipleOccurrences(int[][] array, int target) {
    boolean found = false;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (target == array[i][j]) {
          System.out.printf("Element found at row %d and column %d\n", i, j);
          found = true;
        }
      }
    }
    if (found == false) {
      System.out.println("Element not found !! ");
    }
  }

  public static void main(String[] args) {
    int[][] arr = TwoDArrayUtility.input2DIntArray();
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the element you want to search : ");
      int target = sc.nextInt();
      System.out.println();
      multipleOccurrences(arr, target);
    } catch (Exception e) {
      System.out.println("Error >> You entered an invalid input !!");
    }
  }
}
