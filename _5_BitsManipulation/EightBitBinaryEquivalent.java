package _5_BitsManipulation;

import java.util.Scanner;

public class EightBitBinaryEquivalent {
    public static void printEightBitEquivalent(int num) {
    // 8 bit reprsentation, hence starting from 7 and shifting every digit to lsb
    // and performing AND with 1 will show the bit is set or not
    for (int i = 7; i >= 0; i--) {
      System.out.print((num >> i) & 1);
    }
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter any decimal number (less than 255) to get its 8-bit binary equivalent : ");
      int num = sc.nextInt();
      printEightBitEquivalent(num);
    }
  }
}
