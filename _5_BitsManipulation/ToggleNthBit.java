package _5_BitsManipulation;

import java.util.Scanner;

public class ToggleNthBit {
  public static int toggleNthBit(int num, int n){
    return (num^(1<<n));
  }
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter any number : ");
      int num = sc.nextInt();
      System.out.print("Enter the bit position (from right) that you want to toggle : ");
      int n = sc.nextInt();
      int res = toggleNthBit(num, n-1);
      System.out.printf("Binary Equivalent of entered number '%d' is : ",num);
      EightBitBinaryEquivalent.printEightBitEquivalent(num);
      System.out.printf("\nAfter toggling bit position '%d' from right, it becomes %d and its binary equivalent becomes : ",n, res);
      EightBitBinaryEquivalent.printEightBitEquivalent(res);
      System.out.println("\n");
    }
  }
}
