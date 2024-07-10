package _5_BitsManipulation;

import java.util.Scanner;

public class CharCaseConversion {
  public static int toUppercase(int letter) {
    return (letter & ~(1 << 5));
    // // as ~(1<<5) == 11011111 and '_' == 01011111
    // return (letter & '_');
  }

  public static int toLowercase(int letter) {
    return (letter | (1 << 5));
    // // as (1<<5) == 00100000 == ' '
    // return (letter | ' ');
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter the character : ");
      char letter = sc.next().charAt(0);

      if (letter >= 97 && letter < 123) {
        char capital = (char) toUppercase(letter);
        System.out.printf(">> Upper case of '%c' is '%c' \n", letter, capital);
      } else if (letter >= 65 && letter < 91) {
        char small = (char) toLowercase(letter);
        System.out.printf(">> Lower case of '%c' is '%c' \n", letter, small);
      } else {
        System.out.println(">> It's not an alphabet !!\n");
      }
    }
  }
}
