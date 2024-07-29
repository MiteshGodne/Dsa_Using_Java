package _8_ArraySearching;
// QUE-1283 Given an array of integers arr and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).

public class BinarySearchLeetCode1283FindSmallestDivisor {

  public static int findSmallestDivisor(int[] arr, int threshold) {
    int smallestDivisor = -1, mid;
    int start = 1;

    int end = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (end < arr[i])
        end = arr[i];
    }
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (isDivisorValid(arr, mid, threshold)) {
        smallestDivisor = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return smallestDivisor;
  }

  public static boolean isDivisorValid(int[] arr, int assumedDivisor, int threshold) {

    int currentSumOfDivisions = 0;
    for (int i = 0; i < arr.length; i++) {
      int temp = (int) Math.ceil((arr[i] / (double)assumedDivisor));
      currentSumOfDivisions += temp;
      // if threshold required are more than available, it's not a valid case
      if (currentSumOfDivisions > threshold) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 5, 9 };
    int threshold = 6;
    int smallestDivisor = findSmallestDivisor(arr, threshold);
    if (smallestDivisor > 0) {
      System.out.printf("Smallest Divisor is %d ", smallestDivisor);
    } else {
      System.out.println("No Smallest Divisor present with sum of divisions less then threshold");
    }
  }
}