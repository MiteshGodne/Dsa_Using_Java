package _8_ArraySearching;

import java.util.Arrays;

public class AllocatingMinimumNoOfPages {
  public static boolean canBeAllocated(int books[], int maxPages, int students) {
    int currentStudents = 1, pagesAllocated = 0;
    for (int i = 0; i < books.length; i++) {
      pagesAllocated += books[i];
      // If pages exceed the maxPage limit, more students will be required
      if (pagesAllocated > maxPages) {
        // 1 student added
        currentStudents += 1;
        pagesAllocated = books[i];
      }
      // If students required are more than available, then invalid case
      if (currentStudents > students) {
        return false;
      }
    }
    return true;
  }

  public static int findMinPagesAllocated(int books[], int students) {
    // all students will not get 1 book at least.
    if (books.length < students) {
      return -1;
    }
    // Find range to apply binary search // From Max to Sum
    int start = Arrays.stream(books).max().getAsInt(); // Max
    int end = Arrays.stream(books).sum(); // Sum
    int res = -1; // answer to be returned

    while (start <= end) {
      int mid = start + (end - start) / 2;// max pages that can be allocated to 1 student (probable ans)

      // minimize no. of pages if more permutations possible
      if (canBeAllocated(books, mid, students)) {
        res = mid;
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] books = { 12, 34, 67, 90 };
    int minPagesAllocated = findMinPagesAllocated(books, 2);
    if (minPagesAllocated > 0) {
      System.out.printf("Minimum pages allocated to student with maximum pages %d", minPagesAllocated);
    }
  }
}
