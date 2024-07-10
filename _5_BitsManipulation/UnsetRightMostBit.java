package _5_BitsManipulation;

import java.util.Scanner;

public class UnsetRightMostBit {
  public static int unsetRightMostSetBit(int num){
    return (num&(num-1));
  }
   public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter any decimal number : ");
      int num = sc.nextInt();
      int res = unsetRightMostSetBit(num);
      System.out.print(">> Binary equivalent of your number is ");
      EightBitBinaryEquivalent.printEightBitEquivalent(num);
      System.out.print("\n>> Binary equivalent after unsetting right most set bit is ");
      EightBitBinaryEquivalent.printEightBitEquivalent(res);
    }
  }

}
