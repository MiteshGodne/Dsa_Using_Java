package _2_NumberSeries;

import java.util.Scanner;

public class GCD {
  // Brute force
  public static int gcd(int n1, int n2) {
    int min = Math.min(n1, n2);
    for (int i = min; i > 1; i--) {
      if (n1 % i == 0 && n2 % i == 0) {
        return i;
      }
    }
    return 1;
  }

  // Euclid's Algo
  public static int euclidGcd(int a, int b) {
    int count =0 ;
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
      count++;
    }
    System.out.println(count);
    return a;
  }

  // Gabriel Lame Algo
  public static int gabrielGcd(int a, int b) {
    while (a!=0 && b!=0) {
      if (a > b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }
    if(a!=0)return a;
    else return b;
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num1 = scan.nextInt();
    System.out.print("Enter a number : ");
    int num2 = scan.nextInt();
    // System.out.println(gcd(num1, num2));
    // System.out.println(euclidGcd(num1, num2));
    System.out.println(gabrielGcd(num1, num2));

  }
}
