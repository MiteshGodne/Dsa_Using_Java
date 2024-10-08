

import _6_Arrays.ArrayUtility;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class Practice{
//   public static void main(String[] args) throws IOException {
//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String input = br.readLine();
//     int fact= 1;
//     for (int i = 1; i <= Integer.parseInt(input); i++) {
//       fact = fact*i;
//     }
//     System.out.println(fact);
//   }
// }
public class Practice {
  public static void func(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] *= 2;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 10, 20, 30, 40, 50 };
    func(arr);
    ArrayUtility.printIntegerArray(arr);
  }
}