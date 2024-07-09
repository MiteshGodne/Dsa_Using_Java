package _5_BitsManipulation;

import java.util.Scanner;

public class SetNthBit {
  public static int setNthBit(int num, int n){
    return (num|(1<<n));
  }
  public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number : ");
      int num = sc.nextInt();
      System.out.print("Enter the bit position (from right) : ");
      int n = sc.nextInt();
      int res = setNthBit(num, n-1);
      System.out.printf("\n>> After setting bit position '%d' of the number '%d', binary equivalent becomes : ",n, num);
      EightBitBinaryEquivalent.printEightBitEquivalent(res);
      System.out.println("\n");
    }
  }
}
