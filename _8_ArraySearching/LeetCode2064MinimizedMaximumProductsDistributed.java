package _8_ArraySearching;

//Que.2064 : You are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.

//You need to distribute all products to the retail stores following these rules:

//A store can only be given at most one product type but can be given any amount of it.
//After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
//Return the minimum possible x.

public class LeetCode2064MinimizedMaximumProductsDistributed {

  public static int minimizedMaximumDistribution(int totalStores, int[] quantities) {

    int result = -1, mid, start = 1, end = Integer.MIN_VALUE;
    for (int i = 0; i < quantities.length; i++) {
      if (quantities[i] > end)
        end = quantities[i];
    }

    while (start <= end) {
      mid = start + (end - start) / 2;
      if (isStoreCountValid(quantities, mid, totalStores)) {
        result = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return result;
  }

  public static boolean isStoreCountValid(int[] quantities, int assumedResult, int totalStores) {
    int currentStores = 0;
    for (int i = 0; i < quantities.length; i++) {
      currentStores += quantities[i] / assumedResult;
      if (quantities[i] % assumedResult != 0) {
        currentStores++;
      }
      if (currentStores > totalStores) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] quantities = { 15, 10, 10 };
    int totalStores = 7;
    int minOfMaxProducts = minimizedMaximumDistribution(totalStores, quantities);
    if (minOfMaxProducts > 0) {
      System.out.printf("Minimized of maximum products that can be distributed are %d ", minOfMaxProducts);
    } else {
      System.out.println("Products cannot be distributed.");
    }
  }
}
