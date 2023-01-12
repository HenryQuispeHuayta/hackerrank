package week01;

public class FizzBuzz {
  public static void main(String[] args) {
    FizzBuzzResult.fizzBuzz(15);
  }
}

class FizzBuzzResult {
  public static void fizzBuzz(int n) {
    for (int i = 1; i <= n; i++) {
      String output = "";

      if (i % 3 == 0 && i % 5 == 0) {
        output = "FizzBuzz";
      } else {
        output = String.valueOf(i);
      }

      if (i % 3 == 0 && i % 5 != 0)
        output = "Fizz";

      if (i % 5 == 0 && i % 3 != 0)
        output = "Buzz";

      System.out.println(output);
    }
  }
}