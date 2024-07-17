package _8_ArraySearching;

import _7_TwoDArray.TwoDArrayUtility;

public class MaxSumOfSubArraysIn2D {
  int subArray, sum = 0, maxSum = Integer.MIN_VALUE;

  static public MaxSumOfSubArraysIn2D maxSumSubArray(int arr[][]) {
    MaxSumOfSubArraysIn2D maxObj = new MaxSumOfSubArraysIn2D();
    int j;
    for (int i = 0; i < arr.length; i++) {
      maxObj.sum = 0;
      for (j = 0; j < arr[i].length; j++) {
        maxObj.sum += arr[i][j];
      }
      if (maxObj.maxSum < maxObj.sum) {
        maxObj.subArray = i;
        maxObj.maxSum = maxObj.sum;
      }
    }
    return maxObj;
  }

  public static void main(String[] args) {
    MaxSumOfSubArraysIn2D result = new MaxSumOfSubArraysIn2D();
    int arr[][] = TwoDArrayUtility.input2DIntArray();
    result = maxSumSubArray(arr);
    System.out.printf("\nMaximum sum is %d of Sub Array present at index %d of 2D Array", result.maxSum, result.subArray + 1);
  }
}