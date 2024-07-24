package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class FloorAndCeilByBinarySearch {
  int index, value;

  public FloorAndCeilByBinarySearch(int index, int value) {
    this.index = index;
    this.value = value;
  }

  public static FloorAndCeilByBinarySearch floorFromArrayByBinarySearch(int arr[], int target) {
    int floor = -1, floorIdx = -1, start = 0, end = arr.length - 1, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        floorIdx = mid;
        floor = arr[mid];
        return new FloorAndCeilByBinarySearch(floorIdx, floor);
      } else if (arr[mid] < target) {
        start = mid + 1;
        floor = arr[mid];
        floorIdx = mid;
      } else {
        end = mid - 1;
      }
    }
    return new FloorAndCeilByBinarySearch(floorIdx, floor);
  }

  public static FloorAndCeilByBinarySearch ceilFromArrayByBinarySearch(int arr[], int target) {
    int ceil = -1, ceilIdx = -1, start = 0, end = arr.length - 1, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        ceilIdx = mid;
        ceil = arr[mid];
        return new FloorAndCeilByBinarySearch(ceilIdx, ceil);
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
        ceil = arr[mid];
        ceilIdx = mid;
      }
    }
    return new FloorAndCeilByBinarySearch(ceilIdx, ceil);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the array size : ");
      int size = sc.nextInt();

      System.out.print(
          "\nNote - Enter the array elements in increasing order only as this program runs on Binary Search Algorithm - \n");
      int arr[] = ArrayUtility.inputIntArray(size);

      System.out.print("\nEnter the target element to search it's floor and ceil from the array : ");
      int target = sc.nextInt();

      FloorAndCeilByBinarySearch floor = floorFromArrayByBinarySearch(arr, target);
      if (floor.index < 0) {
        System.out.printf("\nNo floor element of target is present in the array.\n");
      } else {
        System.out.printf("\nFloor of the target element is '%d' , present at index %d", floor.value, floor.index);
      }
      FloorAndCeilByBinarySearch ceil = ceilFromArrayByBinarySearch(arr, target);
      if (ceil.index < 0) {
        System.out.printf("\nNo ceil element of target is present in the array.\n");
      } else {
        System.out.printf("\nCeil of the target element is '%d' ,  present at index %d", ceil.value, ceil.index);
      }
    } catch (Exception e) {
      System.out.print("\nError >> Invalid Input !!");
    }
  }
}
