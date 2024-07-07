package _4_MathAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SieveAlgorithm {
  // Used to print all prime numbers in a given range
  public static void sieveAlgo(int num) {
    boolean arr[] = new boolean[num + 1];
    int counter = 2;
    Arrays.fill(arr, true);
    while (counter <= num) {
      if (arr[counter] == true) {
        for (int factor = counter + counter; factor <= num; factor += counter) {
          // all multiples of factors are termed as non-prime
          arr[factor] = false;
        }
      }
      counter++;
    }
    System.out.printf("\nPrime numbers till %d are : ", num);
    for (int prime = 2; prime < num; prime++) {
      if (arr[prime])
        System.out.print(prime + " ");
    }
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter a number till which you want to print prime numbers : ");
      int num = sc.nextInt();
      if (num == 0)
        throw new Exception();
      sieveAlgo(num);
    } catch (Exception e) {
      System.out.println("\nError : A number greater than zero is required.");
    }
  }
}
