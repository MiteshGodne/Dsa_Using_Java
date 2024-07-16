package _6_Arrays;

import java.util.Scanner;

public class ArrayUtility {
  public static void printIntegerArray(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static int[] inputIntArray(int size) {
    int arr[] = new int[size];
    @SuppressWarnings("resource")
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < arr.length; i++) {
      System.out.print("Enter array element " + (i + 1) + " : ");
      arr[i] = scan.nextInt();
    }
    return arr;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the array size : ");
      int size = sc.nextInt();
      int[] arr = inputIntArray(size);
      System.out.print("Array elements are : ");
      printIntegerArray(arr);
    } catch (Exception e) {
      System.out.println("Invalid Input !!");
    }
  }
}