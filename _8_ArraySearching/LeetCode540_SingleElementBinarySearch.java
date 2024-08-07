package _8_ArraySearching;

import java.util.Scanner;

import _6_Arrays.ArrayUtility;

public class LeetCode540_SingleElementBinarySearch {
  public static int singleNonDuplicate(int nums[]) {
    System.out.println("start");
    if (nums.length == 1) {
      return nums[0];
    }
    if (nums.length == 2) {
      if (nums[0] == nums[1]) {
        return -1;
      }
      return nums[0];
    }

    int start = 0, end = nums.length - 1, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (end - start > 1 && nums[mid] < nums[mid + 1] && nums[mid] > nums[mid - 1]) {
        return nums[mid];
      }
      if (start == end) {
        return nums[start];
      }
      if (nums[mid] == nums[mid - 1]) {
        int leftElements = mid - 1;
        if (leftElements % 2 == 1) {
          end = mid - 2;
        } else {
          start = mid + 1;
        }
      } else {
        int leftElements = mid;
        if (leftElements % 2 == 1) {
          end = mid - 1;
        } else {
          start = mid + 2;
        }
      }
    }
    return nums[end];
  }

  public static int singleNonDuplicateUsingXor(int[] nums){
    int start = 0, end = nums.length-2;
    while(start<=end){
      int mid = start + (end-start)/2;
      // if true, then its a left half --> move right
      if(nums[mid] == nums[mid^1]){
        start = mid + 1;
      }else{
        end = mid-1;
      }
    }
    return nums[start];
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the size of array : ");
      int size = sc.nextInt();
      System.out.println("Enter array elements in ascending order : ");
      int nums[] = ArrayUtility.inputIntArray(size);
      int nonDuplicate = singleNonDuplicate(nums);
      if (nonDuplicate == -1) {
        System.out.println("Not Present");
      } else {
        System.out.println("Non duplicate element is : " + nonDuplicate);
      }
    } catch (Exception e) {
      System.out.println("Invalid Input !! \nDetails : " + e);
    }
  }
}
