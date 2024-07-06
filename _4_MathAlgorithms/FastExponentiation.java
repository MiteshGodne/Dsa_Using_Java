package _4_MathAlgorithms;

import java.util.Scanner;

public class FastExponentiation{

  static void fastExponentiation(int num, int pow){
    int res = 1;
    while(pow>0){
      if(pow%2!=0) res*=num;
      pow/=2;
      num*=num;
    }
    System.out.print("Result of exponentiation is : " + res);
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the base number : ");
      int num = sc.nextInt();
      System.out.print("Enter the pow number : ");
      int pow = sc.nextInt();
      fastExponentiation(num, pow);
    }
  }
}