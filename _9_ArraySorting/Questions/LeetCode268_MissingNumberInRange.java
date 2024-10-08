package _9_ArraySorting.Questions;

public class LeetCode268_MissingNumberInRange {

  // Cycle Sort is not required !!
  public static int missingNumber(int[] nums) {
    int n = nums.length;
    int totalSumReq = n * (n + 1) / 2;
    int currentSum = 0;
    for (int i = 0; i < nums.length; i++) {
      currentSum += nums[i];
    }
    return totalSumReq - currentSum;
  }

  public static void main(String[] args) {
    // Constraints -
    // 1] no duplicates
    // 2] only single element missing
    // 3] elements are positive range [0 to n]
  
    int nums[] = { 2, 3, 1 };
    int missingNum = missingNumber(nums);
    if (missingNum < 0) {
      System.out.println("No number is missing or More than one number is missing.");
    } else {
      System.out.println("Missing number is : " + missingNum);
    }
  }
}
