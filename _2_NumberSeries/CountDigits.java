package _2_NumberSeries;

import java.util.Scanner;

public class CountDigits {

  static void countDigitsByLoop(int num) {
    int count = 0;
    if (num == 0) {
      System.out.println("Number of digits : 1");
      return;
    }
    while (num > 0) {
      count++;
      num /= 10;
    }
    System.out.println("Number of digits : " + count);
  }

  // log can be used to find the power of base required to compute the number.
  // rounding off the value of x is equals to the count digits in that number.
  // Expressions ---> 10^x = number ---> x = log10(number)
  static void countDigitsByLog(int num) {

    if (num == 0) {
      System.out.println("Number of digits : 1");
      return;
    }

    int countCeil = (int) Math.ceil(Math.log10(num));
    int countAdditon = (int) (Math.log(num) / Math.log(10)) + 1;

    System.out.println("Number of digits : " + countCeil);
    System.out.println("Number of digits : " + countAdditon);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number : ");
      int num = sc.nextInt();
      countDigitsByLoop(num);
      countDigitsByLog(num);
    }
  }
}
