package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class ArrayLinearSearch {
  public static int linearSearch(int[] array, int target, boolean findLast) {
    int occurance = -1;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        if (findLast == false) {
          occurance = i;
          return occurance;
        } else {
          occurance = i;
        }
      }
    }
    return occurance;
  }

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the array size : ");
      int size = scanner.nextInt();

      int array[] = ArrayUtility.inputIntArray(size);

      System.out.print("\nEnter the target element you want to search : ");
      int target = scanner.nextInt();

      System.out.print("\nEnter Y/y if you want the last occurrance of target : ");
      char last = scanner.next().charAt(0);
      boolean findLast = false;

      if (last == 'Y' || last == 'y') {
        findLast = true;
      }

      int index = linearSearch(array, target, findLast);

      if (index >= 0) {
        System.out.printf("\nElement found at position %d\n", index + 1);
      } else {
        System.out.print("\nElement Not Found !!\n");
      }
    } catch (Exception e) {
      System.out.println("\n Error >> Invalid Input !!\n");
    }
  }
}
