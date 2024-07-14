package _6_Arrays;

import java.util.Scanner;

public class UpdateIntArray {
  public static void updateIntArray(int[] arr, int posi, int element) {
    arr[posi] = element;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the size of your array : ");
      int size = sc.nextInt();

      int arr[] = new int[size];

      for (int i = 0; i < arr.length; i++) {
        System.out.print("Enter array element " + (i + 1) + " : ");
        arr[i] = sc.nextInt();
      }

      System.out.print("\nEnter the index at which you want to update the element : ");
      int posi = sc.nextInt();
      if (posi > arr.length - 1 || posi < 0) {
        System.out.println("\n>> You entered invalid position !!");
      } else {
        System.out.print("\nEnter the element you want to insert : ");
        int ele = sc.nextInt();
        System.out.print("\nArray before updation : ");
        ArrayUtility.printIntegerArray(arr);
        updateIntArray(arr, posi-1, ele);
        System.out.print("\nArray after updation :  ");
        ArrayUtility.printIntegerArray(arr);
      }
    } catch (Exception e) {
      System.out.println("Invalid Input !!");
    }
  }
}
