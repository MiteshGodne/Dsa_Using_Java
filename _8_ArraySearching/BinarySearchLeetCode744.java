package _8_ArraySearching;

// Que.744 -  You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

public class BinarySearchLeetCode744 {
  public static char nextGreatestLetter(char[] letters, char target) {
    char res = letters[0];
    int start = 0, end = letters.length - 1, mid;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (letters[mid] <= target) {
        start = mid + 1;
      } else {
        res = letters[mid];
        end = mid - 1;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    char[] letters = { 'c', 'f', 'h'};
    char res = nextGreatestLetter(letters, 'c');
    System.out.println(res);
  }
}
