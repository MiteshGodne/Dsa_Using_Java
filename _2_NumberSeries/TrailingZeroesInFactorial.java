package _2_NumberSeries;

import java.util.Scanner;

public class TrailingZeroesInFactorial {

  // Logic -> num / i will give total no of i in num
  // calculating all 5, 5*5, 5*5*5,..... ---> therefore updation is i*i
  public static int getTrailingZeroesInFactorial(int num) {
    double res = 0;
    for (int i = 5; i <= num; i = i * i) {
      res = res + num / i;
    }
    return (int) res;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number : ");
      int num = sc.nextInt();
      System.out.printf("Trailing Zeroes in factorial of %d are %d", num, getTrailingZeroesInFactorial(Math.abs(num)));
    }
  }
}
