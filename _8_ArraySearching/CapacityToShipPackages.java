package _8_ArraySearching;

import java.util.Arrays;

public class CapacityToShipPackages {

  public static boolean isShipmentPossible(int weights[], int maxCapacity, int days) {
    int currentDays = 1, capacity = 0;
    for (int i = 0; i < weights.length; i++) {
      capacity += weights[i];
      // If packages exceed the maxCapacity limit, more days will be required
      if (capacity > maxCapacity) {
        // 1 more day required
        currentDays += 1;
        capacity = weights[i];
      }
      // If days required are more than available, then invalid case
      if (currentDays > days) {
        return false;
      }
    }
    return true;
  }

  public static int findLeastCapacityNeeded(int weights[], int days) {
    // Range may lie between Max and Sum -
    // >> From Max capacity to ship 1 package in 1 day
    // >> To Sum capacity to ship all packages in 1 day
    int start = Arrays.stream(weights).max().getAsInt(); // Max = 4
    int end = Arrays.stream(weights).sum(); // Sum = 16
    int res = -1; // answer to be returned

    while (start <= end) {
      // max capacity that can be shipped in 1 day (probable ans)
      int mid = start + (end - start) / 2;

      // if shipment is possible, then reduce the required capacity
      if (isShipmentPossible(weights, mid, days)) {
        res = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int weights[] = {1,2,3,1,1 }, days = 4;
    int leastCapacityNeeded = findLeastCapacityNeeded(weights, days);
    if (leastCapacityNeeded > 0) {
      System.out.printf("Least Capacity Needed : %d", leastCapacityNeeded);
    }
  }
}
