package _8_ArraySearching;

import java.util.Arrays;

public class AggressiveCowsGFGBinarySearch {

  public static int maxOfMinDistance(int[] stalls, int cows) {
    int result = -1, mid;
    if (stalls.length < cows)
      return result;
    int start = 1;
    int end = stalls[stalls.length - 1] - stalls[0];
    System.out.println(end);

    while (start <= end) {
      mid = start + (end - start) / 2;
      if (isAllocationPossible(stalls, mid, cows)) {
        result = mid;
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return result;
  }

  public static boolean isAllocationPossible(int[] stalls, int assumedDiff, int noOfCows) {
    int cowsPlaced = 1, lastCowDistance = stalls[0];
    for (int i = 0; i < stalls.length; i++) {
      // check if minimum distance is maintained
      // then increase the count of cow and assign new location
      if (stalls[i] - lastCowDistance >= assumedDiff) {
        cowsPlaced += 1;
        lastCowDistance = stalls[i];
      }
      if (cowsPlaced >= noOfCows) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int stalls[] = { 10, 1, 2, 7, 5 };
    Arrays.sort(stalls);
    int cows = 3;
    int maxOfMin = maxOfMinDistance(stalls, cows);
    if (maxOfMin > 0) {
      System.out.println("Cows can be placed with the maximum of minimum difference : " + maxOfMin);
    } else {
      System.out.println("Cows cannot be placed !! ");
    }
  }
}
