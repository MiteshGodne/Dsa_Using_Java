package _2_NumberSeries;

import java.util.Scanner;

public class Fibonnacci {

  // Space Complexity = O(n)
  static void unoptimisedFibonnacci(int n) throws NegativeArraySizeException {
    int[] fib = new int[n];
    fib[0] = 0;
    fib[1] = 1;

    for (int i = 0;; i++) {
      if (i == 0 || i == 1) {
        System.out.print(fib[i] + " ");
        continue;
      }
      fib[i] = fib[i - 1] + fib[i - 2];
      if (fib[i] > n)
        return;
      System.out.print(fib[i] + " ");
    }
  }

  // Space Complexity = O(1)
  static void optimisedFibonnacci(int n) {

    int first = 0, second = 1, third = 0;
    for (int i = 0;; i++) {
      if (i == 0 || i == 1)
        System.out.print(i + " ");
      third = first + second;
      if (third > n)
        return;
      System.out.print(third + " ");
      first = second;
      second = third;
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a Positive Integer : ");
    try (Scanner scan = new Scanner(System.in)) {
      int num = scan.nextInt();
      optimisedFibonnacci(num);
      System.out.println();
      unoptimisedFibonnacci(num);
    } catch (Exception e) {
      System.out.println("Error !! Input should be greater than 0.");
    }
  }
}
