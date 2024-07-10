package _5_BitsManipulation;

import java.util.Scanner;

public class ClearNBits {
  public static int clearAllBitsTillNFromLSB(int num, int bit) {
    return (num & (~((1 << bit) - 1)));
  }

  public static int clearAllBitsTillNFromMSB(int num, int bit) {
    return (num & ((1 << bit) - 1));
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a decimal number : ");
      int num = sc.nextInt();

      System.out.print("To clear bits from LSB enter 0 and to clear bits from MSB enter 1 :  ");
      int choice = sc.nextInt();

      // Clearing bits from LSB
      if (choice == 0) {
        System.out.print(
            "Enter nth bit till which you want to clear from LSB (count from right most bit and count begins from 1): ");
        int bit = sc.nextInt();
        int res = clearAllBitsTillNFromLSB(num, bit);
        System.out.print(">> Binary equivalent of your number is ");
        EightBitBinaryEquivalent.printEightBitEquivalent(num);
        System.out.printf("\n>> Binary equivalent after clearing all bits till %dth bit from LSB is ", bit);
        EightBitBinaryEquivalent.printEightBitEquivalent(res);
      }
      // Clearing bits from MSB
      else if (choice == 1) {
        System.out.print(
            "Enter nth bit till which you want to clear from MSB (count from right most bit and count begins from 1) : ");
        int bit = sc.nextInt();
        int res = clearAllBitsTillNFromMSB(num, bit);
        System.out.print(">> Binary equivalent of your number is ");
        EightBitBinaryEquivalent.printEightBitEquivalent(num);
        System.out.printf("\n>> Binary equivalent after clearing all bits till %dth bit from MSB is ", bit);
        EightBitBinaryEquivalent.printEightBitEquivalent(res);
      }
      // For wrong choices
      else {
        System.out.println("Error >> You entered the wrong choice !!");
      }
    }
  }

}
