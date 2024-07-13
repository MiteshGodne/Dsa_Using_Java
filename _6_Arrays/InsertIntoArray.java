package _6_Arrays;

import java.util.Scanner;

public class InsertIntoArray {
  public static void insertIntoArray(int[] arr, int posi, int element) {
    // Shifting of elements towards the end of the array
    for (int i = arr.length - 2; i >= posi; i--) {
      arr[i + 1] = arr[i];
    }
    arr[posi] = element;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the size of your array : ");
      int size = sc.nextInt();

      int arr[] = new int[size];
      for (int i = 0; i < arr.length; i++) {
        if (i == arr.length - 1) {
          System.out.print(
              "Note : If you add last element and then insert another element in between, last element will be lost. To leave it blank enter Y and to continue press any other key : ");
          char choice = sc.next().charAt(0);
          if (choice == 'Y' || choice == 'y') {
            break;
          }
        }
        System.out.print("Enter array element " + (i + 1) + " : ");
        arr[i] = sc.nextInt();
      }

      System.out.print("Enter the position after which you want to add the element : ");
      int posi = sc.nextInt();
      if (posi < 0 || posi > arr.length - 1) {
        System.out.println("You entered invalid position !!");
      } else {
        System.out.print("Enter the element you want to insert : ");
        int ele = sc.nextInt();
        ArrayUtility.printIntegerArray(arr);
        insertIntoArray(arr, posi, ele);
        System.out.println("\n");
        ArrayUtility.printIntegerArray(arr);
      }
    } catch (Exception e) {
      System.out.println("Invalid Input !!");
    }
  }
}
