package _8_ArraySearching;

import java.util.Scanner;

public class LeetCode69_SqrtOfElementInInteger {

  public static int sqrtByBinarySearch(int num) {
    int start = 1, end = num;
    int sqrt = 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid <= num / mid) {
        if (num % mid == 0 && mid == num / mid) {
          return mid;
        }
        start = mid + 1;
      } else {
        end = mid - 1;
        sqrt = end;
      }
    }
    return sqrt;
  }

  public static void main(String[] args) {
    System.out.print("Enter a number to find its nearest down square root : ");
    try (Scanner sc = new Scanner(System.in)) {
      int num = sc.nextInt();
      int sqrt = sqrtByBinarySearch(num);
      System.out.println("Square Root is : " + sqrt);
    } catch (Exception e) {
      System.out.println("Invalid Input !!\nDetails : " + e);
    }
  }
}
