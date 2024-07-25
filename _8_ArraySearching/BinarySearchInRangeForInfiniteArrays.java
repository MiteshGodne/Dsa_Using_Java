package _8_ArraySearching;

public class BinarySearchInRangeForInfiniteArrays {

  static int binarySearchInRange(int arr[], int target, int start, int end) {
    int ans = -1, mid;
    while (start <= end) {
      mid = start + ((end - start) / 2);
      if (arr[mid] == target) {
        ans = mid;
        return ans;
      } else if (arr[mid] < target) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {

    int[] infiniteArr = { 2, 2, 4, 5, 7, 9, 12, 25, 88, 93 };
    int target = 50;

    int range[] = RangeForInfiniteArray.rangeOfInfiniteArray(infiniteArr, target);
    System.out.printf("Range found by Binary Search is %d to %d", range[0], range[1]);

    int index = binarySearchInRange(infiniteArr, target, range[0], range[1]);

    if (index < 0) {
      System.out.println("\n>> Element is not present in the array.");
    } else {
      System.out.printf("\n>> Element found at index %d", index);
    }
  }
}
