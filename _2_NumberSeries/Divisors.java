package _2_NumberSeries;

import java.util.Scanner;

public class Divisors {
  // Time Complexity is :- (sqrt(n)) = 0(sqrt(n)+sqrt(n))
  public static void printDivisorSorted(int num) {
    int i;
    for (i = 1; i * i < num; i++) {
      if (num % i == 0) {
        System.out.print(i + " ");
      }
    }
    // seperating loops to display result in ascending order.
    for (; i >= 1; i--) {
      if (num % i == 0) {
        System.out.print(num / i + " ");
      }
    }
  }

  public static void printDivisorUnsorted(int num) {
    int count = 1;
    System.out.print("All divisors are - ");
    while (count * count <= num) {
      if (num % count == 0) {
        System.out.print(count + " ");
        if (count == num / count) {

        } else {
          System.out.print(num / count + " ");
        }
      }
      count++;
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    printDivisorUnsorted(num);
  }
}