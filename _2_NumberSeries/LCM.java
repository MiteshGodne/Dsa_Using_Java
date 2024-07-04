package _2_NumberSeries;
import java.util.Scanner;

public class LCM {

  // Brute force method
  public static void lcm(int num1, int num2) {
    int max = Math.max(num1, num2);
    int count = 0;
    for (int i = max; i <= num1 * num2; i++) {
      count++;
      if (i % num1 == 0 && i % num2 == 0) {
      System.out.println(count);
        System.out.println("LCM is " + i);
        return;
      }
    }
  }

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num1 = scan.nextInt();
    System.out.print("Enter a number : ");
    int num2 = scan.nextInt();
    lcm(num1, num2);

    // Euclid's Algorithm
    System.out.println((num1*num2)/(GCD.gabrielGcd(num1,num2)));
  }
}
