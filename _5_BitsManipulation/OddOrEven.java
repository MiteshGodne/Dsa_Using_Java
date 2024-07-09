package _5_BitsManipulation;

import java.util.Scanner;

public class OddOrEven {

  public static void oddOrEven(int num) {
    if ((num&1) == 1)
      System.out.printf("%d is odd", num);
    else
      System.out.printf("%d is even", num);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number you want to check for Odd or Even : ");
      int num = sc.nextInt();
      oddOrEven(num);
    }
  }
}
