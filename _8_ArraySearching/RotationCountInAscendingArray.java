package _8_ArraySearching;

public class RotationCountInAscendingArray {

  public static int clockwiseRotationCount(int arr[]) {
    int clockwiseRotations = MinAndMaxInRotatedAscendingArray.minIndexInRotatedAscArrayWithDuplicates(arr);
    return clockwiseRotations;
  }

  public static int antiClockwiseRotationCount(int arr[]) {
    int indexOfMin = MinAndMaxInRotatedAscendingArray.minIndexInRotatedAscArrayWithDuplicates(arr);
    int antiClockwiseRotations = (arr.length - indexOfMin) % arr.length;
    return antiClockwiseRotations;
  }

  public static void main(String[] args) {
    int arr[] = { 8, 2, 4, 5, 6 };
    int clockwiseRotations = clockwiseRotationCount(arr);
    System.out.printf(">> Clockwise Rotation Count is %d \n", clockwiseRotations);

    int antiClockwiseRotations = antiClockwiseRotationCount(arr);
    System.out.printf("\n>> Anti Clockwise Rotation Count is %d \n", antiClockwiseRotations);
  }
}
