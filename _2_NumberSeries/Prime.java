package _2_NumberSeries;

import java.util.Scanner;

// 3 times efficient than effecient method itself.
// Time complexity is even lesser than 0(sqrt(n))
public class Prime {
  public static boolean isPrime(int n) {
    if (n == 1)
      return false;

    // skipping 2 and 3
    if (n == 2 || n == 3)
      return true;
    // skipping all the multiples of 2 and 3
    if (n % 2 == 0 || n % 3 == 0)
      return false;

    // Incrementing by 6 hence most efficient
    for (int i = 5; i <= Math.sqrt(n); i += 6) {
      if (n % i == 0 || n % (i + 2) == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    if (isPrime(num)) {
      System.out.println("Prime");
    } else {
      System.out.println("Not a prime");
    }
  }
}
