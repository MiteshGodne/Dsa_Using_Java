package _3_NumberSystem;

import java.util.Scanner;

public class AnyBaseToDecimal {
  public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.print("Enter your number's base - 2 for binary, 8 for octal and 16 for hexadecimal  : ");
      int base = scan.nextInt();
      if (base == 2 || base == 8) {
        System.out.print("Enter the number you want to convert into decimal : ");
        int num = scan.nextInt();
        anyBaseToDecimal(num, base);
      } else if (base == 16) {
        System.out.print("Enter the number you want to convert into decimal : ");
        String input = scan.next();
        hexToDecimal(input, base);
      } else {
        throw new Exception("You entered the invalid base.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  static void anyBaseToDecimal(int num, int base) {
    int res = 0, power = 0;
    while (num > 0) {
      res = res + num % 10 * (int) Math.pow(base, power);
      num /= 10;
      power++;
    }
    System.out.println("Conversion result : " + res);
  }

  static void hexToDecimal(String hexnum, int base) {
    int decimal = 0, i = 0, len, rem;
    len = hexnum.length()-1;
    while (len >= 0) {
      rem = hexnum.charAt(len);
      if (rem >= 48 && rem <= 57)
        rem = rem - 48;
      else if (rem >= 65 && rem <= 70)
        rem = rem - 55;
      else if (rem >= 97 && rem <= 102)
        rem = rem - 87;
      else {
        System.out.println("Invalid hexnum Digit!");
        return;
      }
      decimal = (int) (decimal + (rem * Math.pow(16, i)));
      i++;
      len--;
    }
    System.out.println("Equivalent Decimal Value = " + decimal);
  }

}
