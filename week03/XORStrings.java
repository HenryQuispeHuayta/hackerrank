package week03;

public class XORStrings {
  public static void main(String[] args) {
    String s = "10101";
    String t = "00101";

    System.out.println(XORStringsResult.xor(s, t));
  }
}

class XORStringsResult {
  public static String xor(String s, String t) {
    String xorST = "";
    for (int i = 0; i < s.length(); i++) {
      xorST += s.charAt(i) != t.charAt(i) ? "1" : "0";
    }

    return xorST;
  }
}