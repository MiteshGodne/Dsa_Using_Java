package _8_ArraySearching;

public class MinAndMaxInRotatedAscendingArray {

  public static int maxIndexInRotatedAscArray(int arr[]) {
    int mid, start = 0, end = arr.length - 1;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (mid < arr.length-1 && arr[mid] > arr[mid + 1]) {
        // If left element of mid is bigger than mid is smallest
        return mid;
      } else if (arr[mid] < arr[start]) {
        // If RHS of mid is sorted then min is on LHS, hence move left
        end = mid - 1;
      } else {
        // If LHS of mid is sorted then min is on RHS, hence move right
        start = mid + 1;
      }
    }
    return end;
  }

  // Works when duplicates are not present
  public static int minIndexInRotatedAscArray(int arr[]) {
    int mid, start = 0, end = arr.length - 1;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (mid > 0 && arr[mid] < arr[mid - 1]) {
        // If left element of mid is bigger than mid is smallest
        return mid;
      } else if (arr[mid] < arr[end]) {
        // If RHS of mid is sorted then min is on LHS, hence move left
        end = mid - 1;
      } else {
        // If LHS of mid is sorted then min is on RHS, hence move right
        start = mid + 1;
      }
    }
    return start;
  }

  // Works when duplicates are present
  public static int minIndexInRotatedAscArrayWithDuplicates(int arr[]) {
    int mid, start = 0, end = arr.length - 1;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
        // If both start and end are same then move inside
        start++;
        end--;
      } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
        // If left element of mid is bigger than mid is smallest
        return mid;
      } else if (arr[mid] <= arr[end]) {
        // If RHS of mid is sorted then min is on LHS, hence move left
        end = mid - 1;
      } else {
        // If LHS of mid is sorted then min is on RHS, hence move right
        start = mid + 1;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    int arr[] = {  4, 5, 6,8, 2};
    // int index = minIndexInRotatedAscArray(arr);
    // System.out.printf("Minimum element is %d present at index %d", arr[index],
    // index);

    // int arrWithDuplicates[] = { 1, 3, 3 };
    // int indexOfMin = minIndexInRotatedAscArrayWithDuplicates(arrWithDuplicates);
    // System.out.printf("Minimum element is %d present at index %d",
    // arrWithDuplicates[indexOfMin], indexOfMin);

    int indexOfMax = maxIndexInRotatedAscArray(arr);
    System.out.printf("Maximum element is %d present at index %d", arr[indexOfMax], indexOfMax);
  }
}
