package _8_ArraySearching;

import java.util.Scanner;

public class GFG_CountSquaresBinarySearch {

  public static int countPerfectSquares(int s) {
    int start = 1, end = s;
    int sqrt = 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (mid <= s / mid) {
        if (s % mid == 0 && mid == s / mid) {
          return mid - 1;
        }
        start = mid + 1;
        sqrt = start;
      } else {
        end = mid - 1;
      }
    }
    return sqrt - 1;
  }

  public static void main(String[] args) {
    System.out.print("Enter the sample space number : ");
    try (Scanner sc = new Scanner(System.in)) {
      int sample = sc.nextInt();
      int noOfSquares = countPerfectSquares(sample);
      if (noOfSquares < 0) {
        System.out.println("No Squares present below the sample space");
      } else {
        System.out.println("No of Perfect squares below sample space are : " + noOfSquares);
      }
    } catch (Exception e) {
      System.out.println("Invalid Input !!\nDetails : " + e);
    }
  }
}
