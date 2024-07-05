package _3_NumberSystem;

import java.util.Scanner;

public class DecimalToAnyBase {
  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter the decimal number you want to convert : ");
      int decimalNum = scan.nextInt();

      System.out.print("Enter 2 for binary base, 8 for octal base and 16 for hexaecimal base : ");
      int base = scan.nextInt();

      if (base == 2 || base == 8) {
        decimalToAnyBase(decimalNum, base);
      } else if (base == 16) {
        if (decimalNum == 0) {
          System.out.println("Equivalent value is : " + 0);
          return;
        }
        decimalToHexadecimal(decimalNum, base);
      } else {
        throw new Exception("You entered the invalid base.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  static void decimalToAnyBase(int decimalNum, int base) {
    int res = 0, power = 0;
    while (decimalNum > 0) {
      res = res + (decimalNum % base) * (int) Math.pow(10, power);
      decimalNum /= base;
      power++;
    }
    System.out.print("Equivalent value is : " + res);
  }

  static void decimalToHexadecimal(int decimalNum, int base) {
    String remainder = "", res = "";
    while (decimalNum > 0) {
      if (decimalNum % 16 == 10) {
        remainder = "a";
        res = remainder + res;
      } else if (decimalNum % 16 == 11) {
        remainder = "b";
        res = remainder + res;
      } else if (decimalNum % 16 == 13) {
        remainder = "d";
        res = remainder + res;
      } else if (decimalNum % 16 == 14) {
        remainder = "e";
        res = remainder + res;
      } else if (decimalNum % 16 == 12) {
        remainder = "c";
        res = remainder + res;
      } else if (decimalNum % 16 == 15) {
        remainder = "f";
        res = remainder + res;
      } else {
        if (decimalNum % 16 == 0) {
          res = "0" + res;
        } else {
          res = decimalNum % 16 + res;
        }
      }
      decimalNum /= base;
    }
    System.out.print("Equivalent value is : " + res);
  }
}
