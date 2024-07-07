package _4_MathAlgorithms;

import java.util.Scanner;

public class NewtonRaphsonAlgo {
  // Time Complexity = O ( log(n) )
  public static double newtonRaphsonForSqRoot(int num) {
    double precision = 0.0001, ans, root, x = num;
    while (true) {
      root = 0.5 * (x + num / x);
      ans = x - root;
      if (ans < precision) {
        break;
      }
      x = root;
    }
    return root;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
      System.out.printf("Square Root of %d is %f", num, newtonRaphsonForSqRoot(num));
    }
  }
}
