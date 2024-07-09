package _5_BitsManipulation;


import java.util.Scanner;

public class NthBit {
  public static boolean nthBit(int num, int bit) {
    int res = num & (1 << bit);
    return (res == 0 ? false: true);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter any decimal number : ");
      int num = sc.nextInt();
      System.out.print("Enter nth bit you want to find from its binary equivalent : ");
      int bit = sc.nextInt();
      if(nthBit(num, bit)){
        System.out.print("Nth bit is 1");
      }else{
        System.out.print("Nth bit is 0");
      }
    }
  }
}
