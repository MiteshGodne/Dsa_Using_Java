package _4_MathAlgorithms;

import java.util.Scanner;

public class FastExponentiation {
  // logic if even power -> X^n == (x^2)^n/2
  // logic if odd power -> X^m == (x^2)^((m-1)/2)
  static void fastExponentiation(int num, int power) {
    int result = 1;
    while (power > 0) {
      if (power % 2 != 0) {
        result = result * num;
      }
      power /= 2;
      num = num * num;
    }
    System.out.println(result);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the base number : ");
      int number = sc.nextInt();
      System.out.print("Enter its power : ");
      int power = sc.nextInt();
      fastExponentiation(number, power);
    }
  }
}
