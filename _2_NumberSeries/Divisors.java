package _2_NumberSeries;

import java.util.Scanner;

public class Divisors {
  // Time Complexity is :- (sqrt(n)) = 0(sqrt(n)+sqrt(n))
  public static void printDivisor(int num) {
    int i;
    for (i = 1; i * i < num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
    for (; i >= 1; i--) {
      if (num % i == 0) {
        System.out.print(num / i + " ");
      }
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    printDivisor(num);
  }
}