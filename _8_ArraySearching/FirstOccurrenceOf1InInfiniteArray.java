package _8_ArraySearching;

public class FirstOccurrenceOf1InInfiniteArray {
  public static int firstOccurrenceByBinarySearch(int arr[], int target, int start, int end) {
    int index = -1, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        index = mid;
        end = mid - 1;
      } else if (arr[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    int zeroOne[] = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
    int range[] = RangeForInfiniteArray.rangeOfInfiniteArray(zeroOne, 1);
    int occurrence = firstOccurrenceByBinarySearch(zeroOne, 1, range[0], range[1]);
    System.out.printf("First occurrence of 1 in Infinite array of 0s and 1s sorted in ascending order is at index : %d",
        occurrence);
  }
}
