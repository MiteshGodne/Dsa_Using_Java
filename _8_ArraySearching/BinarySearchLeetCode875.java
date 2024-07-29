package _8_ArraySearching;

//QUE.875 - Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
// Return the minimum integer k such that she can eat all the bananas within h hours.

public class BinarySearchLeetCode875 {

  public static int minSpeedRequired(int[] bananaPiles, int hours) {
    int bananaEatingSpeed = -1, mid;
    int start = 1;
    int end = Integer.MIN_VALUE;
    for (int i = 0; i < bananaPiles.length; i++) {
      if (end < bananaPiles[i])
        end = bananaPiles[i];
    }
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (isEatingSpeedValid(bananaPiles, mid, hours)) {
        bananaEatingSpeed = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return bananaEatingSpeed;
  }

  public static boolean isEatingSpeedValid(int[] bananaPiles, int maxSpeed, int hours) {
    int currentHours = 0;
    for (int i = 0; i < bananaPiles.length; i++) {
      currentHours += bananaPiles[i] / maxSpeed;
      if (bananaPiles[i] % maxSpeed != 0) {
        currentHours++;
      }

      // if hours required are more than available, it's not a valid case
      if (currentHours > hours) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] bananaPiles = { 3, 6, 7, 11 };
    int hours = 8;
    int bananaEatingSpeed = minSpeedRequired(bananaPiles, hours);
    if (bananaEatingSpeed > 0) {
      System.out.printf("Koko can eat banana piles with per hour speed of %d ", bananaEatingSpeed);
    } else {
      System.out.println("Koko can't eat all the banana piles in the given hours.");
    }
  }
}