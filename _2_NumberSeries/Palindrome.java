package _2_NumberSeries;

import java.util.Scanner;

public class Palindrome {
  public static void isPalindrome(int num) {
    int numClone = num, reverse = 0;
    while (num > 0) {
      reverse = reverse * 10 + (num % 10);
      num /= 10;
    }
    if (numClone == reverse)
      System.out.println(numClone + " is a Palindrome number");
    else
      System.out.println(numClone + " is not a Palindrome Number");
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number : ");
      int num = sc.nextInt();
      isPalindrome(num);
    }
  }
}
