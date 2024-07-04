package _2_NumberSeries;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt(), fact = 1, i = 1;
    if (num != 0 || num != 1) {
      while (i <= num) {
        fact = fact * i;
        i++;
      }
      System.out.println(fact);
    } else {
      System.out.println("Factorial is 1.");
    }
  }
}