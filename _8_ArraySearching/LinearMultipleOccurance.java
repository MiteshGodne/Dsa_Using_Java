package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class LinearMultipleOccurance {

  public static void mupltipleOccurances(int[] array, int target) {
    int[] positions = new int[array.length];
    int j = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        positions[j] = i;
      }
      j++;
    }

    if (j != 0) {
      // To Print the positions
      System.out.print("\nPositions where target element is found are : ");
      for (int i = 0; i < j; i++) {
        if (i == --j)
          System.out.print(i + " ");
        else
          System.out.print(i + ", ");
      }
    } else {
      System.out.println("\nElement not found !!");
    }
  }

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter the array size : ");
      int size = scanner.nextInt();

      int array[] = ArrayUtility.inputIntArray(size);

      System.out.print("\nEnter the target element you want to search : ");
      int target = scanner.nextInt();

      mupltipleOccurances(array, target);

    } catch (Exception e) {
      System.out.println("\n Error >> Invalid Input !!\n");
    }
  }
}
