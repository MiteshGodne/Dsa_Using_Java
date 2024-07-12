package _5_BitsManipulation;

public class UniqueNumInArray {

  // Preconditions -
  // 1] Array must have single unique element.
  // 2] Non-Unique elements should be present even times.

  public static void printUniqueElement(int[] arr) {
    int res = 0;
    for (int i = 0; i < arr.length; i++) {
      res = res ^ arr[i];
    }
    System.out.println("Unique element is " + res);
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 3, 2, 1, 6, 7, 6, 7 };
    printUniqueElement(arr);
  }
}
