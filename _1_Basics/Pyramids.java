package _1_Basics;

import java.util.Scanner;

public class Pyramids {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter the number of rows : ");
      int rows = scan.nextInt();
      for (int i = 1; i <= rows; i++) {
        for (int k = rows; k > i; k--) {
          System.out.print("  ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }
}
