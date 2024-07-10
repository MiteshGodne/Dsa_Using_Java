package _5_BitsManipulation;

import java.util.Scanner;

public class SetUnsetNthBit {
  public static int setNthBit(int num, int n) {
    return (num | (1 << n));
  }

  public static int unsetNthBit(int num, int n) {
    return (num & ~(1 << n));
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number : ");
      int num = sc.nextInt();

      System.out.println("To set a bit enter 1 and to unset a bit enter 0");
      int choice = sc.nextInt();

      if (choice == 1) {
        System.out.print("Enter the bit position (from right) you want to set : ");
        int n = sc.nextInt();
        int res = setNthBit(num, n - 1);
        System.out.printf("\n>> After setting bit position '%d' of the number '%d', binary equivalent becomes : ", n,
            num);
        EightBitBinaryEquivalent.printEightBitEquivalent(res);
        System.out.println("\n");
      } else if (choice == 0) {
        System.out.print("Enter the bit position (from right) you want to unset : ");
        int n = sc.nextInt();
        int res = unsetNthBit(num, n - 1);
        System.out.printf("\n>> After setting bit position '%d' of the number '%d', binary equivalent becomes : ", n,
            num);
        EightBitBinaryEquivalent.printEightBitEquivalent(res);
        System.out.println("\n");
      } else {
        System.out.println("Error >> You entered the wrong choice !!");
      }
    }
  }
}
