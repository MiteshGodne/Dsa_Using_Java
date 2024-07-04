package _2_NumberSeries;

import java.util.Scanner;

public class PrimeFactorization {
  // public static boolean isPrime(int n) {
  //   for (int i = 2; i <= Math.sqrt(n); i++) {
  //     if (n % i == 0) {
  //       return false;
  //     }
  //   }
  //   return true;
  // }

  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        while (num % i == 0) {
          System.out.print(i + " ");
          num /= i;
        }
      }
    }
    if (num != 1)
      System.out.println(num);
  }
}
