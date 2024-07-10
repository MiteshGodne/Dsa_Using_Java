package _5_BitsManipulation;

import java.util.Scanner;

public class TotalSetBitsInNumber {
  public static int totalSetBits(int num) {
    int count = 0;
    while (num > 0) {
      num = num & (num - 1);
      count++;
    }
    return count;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a decimal number to find total set bits in it : ");
      int num = sc.nextInt();
      int result = totalSetBits(num);
      System.out.printf(">> Total number of set bits in %d are %d", num, result);
    }
  }
}
