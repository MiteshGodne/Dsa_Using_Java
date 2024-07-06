package _2_NumberSeries;

import java.util.Scanner;

public class ArmstrongNumber {

  public static boolean isArmstrong(int num) {
    int copyNum = num, res = 0;
    int digits = (int) Math.ceil(Math.log10(num));
    while (copyNum > 0) {
      res = res + (int) Math.pow(copyNum % 10, digits);
      copyNum /= 10;
    }
    if (num == res)
      return true;
    return false;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number : ");
      int num = sc.nextInt();
      System.out.print(isArmstrong(num));
    }
  }
}