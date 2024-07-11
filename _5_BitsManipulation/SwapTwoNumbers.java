package _5_BitsManipulation;

import java.util.Scanner;

public class SwapTwoNumbers {
  public static void swapUsingBits(int num1, int num2) {
    // Properties Used -
    // 1] a ^ a = 0
    // 2] a ^ 0 = a
    // X-OR is associative - a^b^c == b^a^c

    num1 = num1 ^ num2;
    num2 = num1 ^ num2; // num2 = (num1 ^ num2) ^ num2 => num1 ^ 0 => num1
    num1 = num1 ^ num2; // num1 = (num1 ^ num2) ^ (num1) => 0 ^ num2 => num2

    System.out.printf("Values after swap :- \nFirst Number = %d, Second Number = %d", num1, num2);
    System.out.println("\n");
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the value of first number : ");
      int num1 = sc.nextInt();
      System.out.print("Enter the value of second number : ");
      int num2 = sc.nextInt();
      System.out.println("\n");

      System.out.printf("Values before swap :- \nFirst Number = %d, Second Number = %d\n", num1, num2);
      swapUsingBits(num1, num2);
    }
  }
}
