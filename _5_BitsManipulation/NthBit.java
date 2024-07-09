package _5_BitsManipulation;


import java.util.Scanner;

public class NthBit {
  public static int nthBit(int num, int bit) {
    int res = num & (1 << bit);
    return (res == 0 ? 0 : 1);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the binary number : ");
      int num = sc.nextInt();
      System.out.print("Enter nth bit you want to find : ");
      int bit = sc.nextInt();
      System.out.print("Nth bit is " + nthBit(num, bit));
    }
  }
}
