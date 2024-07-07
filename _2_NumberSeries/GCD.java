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
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num1 = scan.nextInt();
    System.out.print("Enter a number : ");
    int num2 = scan.nextInt();
    System.out.println(gcd(num1, num2));
  }
}
