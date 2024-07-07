package _4_MathAlgorithms;

import java.util.Scanner;

public class EuclidVsGabrielLameAlgo {
  // Euclid's Algo - GCD (a,b) = GCD (a-b,b) (take a > b)
  // Time complexity is - O(Log(max(a,b)))
  public static int euclidGcd(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  // Gabriel Lame Algo - GCD (a,b) = GCD (a%b,b)
  // Time complexity is - O(Log(min(a,b)))
  public static int gabrielGcd(int a, int b) {
    while (a != 0 && b != 0) {
      if (a > b) {
        a = a % b;
      } else {
        b = b % a;
      }
    }
    if (a != 0) {
      return a;
    } else {
      return b;
    }
  }

  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter a number : ");
      int num1 = scan.nextInt();
      System.out.print("Enter a number : ");
      int num2 = scan.nextInt();
      // Euclid's Algorithm
      System.out.println(euclidGcd(num1, num2));
      // Gabriel Lame's enhanced Euclid's algorithm
      System.out.println(gabrielGcd(num1, num2));
    }
  }
}
