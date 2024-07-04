package _2_NumberSeries;

import java.util.Scanner;

public class FirstDigitOfNum {
  public static void main(String[] args) {
    System.out.print("Enter a number : ");
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int tenToPower = (int) Math.log10(num);
    System.out.println("No. of digits : "+ (tenToPower+1));
    int res = num /((int)Math.pow(10,tenToPower));
    System.out.println("First Digit is :  "+res);
  }
}
