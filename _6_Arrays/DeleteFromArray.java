package _6_Arrays;

import java.util.Scanner;

public class DeleteFromArray {

  public static int[] deleteFromArray(int[] arr, int posi) {
    // Printing the element which will get deleted
    System.out.printf("\nElement deleted from position %d is : %d \n\n", posi + 1, arr[posi]);

    // Worst case time complexity : O(n)S

    // Shifting of elements towards the end of the array
    for (int i = posi; i < arr.length; i++) {
      if (i == arr.length - 1)
        arr[i] = 0;
      else
        arr[i] = arr[i + 1];
    }
    return arr;
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

      System.out.print("\nEnter the position from which you want to delete an element : ");
      int posi = sc.nextInt();
      if (posi > arr.length - 1 || posi < 0) {
        System.out.println("\n>>You entered invalid position !!");
      } else {
        deleteFromArray(arr, (posi - 1));
        System.out.print("After deletion, array becomes : ");
        ArrayUtility.printIntegerArray(arr);
      }
    } catch (Exception e) {
      System.out.println("\n>> Invalid Input !!");
    }
  }
}
