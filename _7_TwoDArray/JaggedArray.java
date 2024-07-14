package _7_TwoDArray;

import java.util.Scanner;

public class JaggedArray {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the root array size : ");
      int size = sc.nextInt();

      int jagged[][] = new int[size][];
      int customRange = 1;

      System.out.println("Input the jagged array - ");
      for (int i = 0; i < jagged.length; i++) {
        jagged[i] = new int[customRange];
        for (int j = 0; j < jagged[i].length; j++) {
          System.out.printf("Enter the element of position arr[%d][%d] : ", i, j);
          jagged[i][j] = sc.nextInt();
        }
        customRange += 2;
      }

      for (int i = 0; i < jagged.length; i++) {
        for (int j = 0; j < jagged[i].length; j++) {
          if (j == (jagged[i].length - 1)) {
            System.out.print(jagged[i][j] + "  ");
          } else {
            System.out.print(jagged[i][j] + " , ");
          }
        }
        System.out.println();
      }

    } catch (Exception e) {
      System.out.println("Error >> Invalid Input !!");
      System.exit(0);
    }
  }
}
