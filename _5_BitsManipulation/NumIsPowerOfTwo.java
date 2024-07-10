package _5_BitsManipulation;

import java.util.Scanner;

public class NumIsPowerOfTwo {
  public static void isNumPowerOfTwo(int num) {
    if ((num & num - 1) == 0) {
      System.out.printf(">> %d is a power of 2.", num);
      return;
    }
    System.out.printf(">> %d is not a powewr of 2.", num);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter any decimal number : ");
      int num = sc.nextInt();
      isNumPowerOfTwo(num);
    }
  }
}
