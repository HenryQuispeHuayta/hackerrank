package week04;

public class CaesarCipher {
  public static void main(String[] args) {
    // System.out.println(CaesarCipherResult.caesarCipher("6DWV95HzxTCHP85dvv3NY2crzt1aO8j6g2zSDvFUiJj6XWDlZvNNr",
    //     87));
    // System.out.println(CaesarCipherResult.caesarCipher("Z", 27));
    System.out.println(CaesarCipherResult.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    // System.out.println((double)(87-26)/26);
    // System.out.println((int) Math.ceil(2.3));
    // int k = 87;
    // int n = k > 26 ? (int) Math.ceil((double) (k - 26) / 26) : 1;
    // System.out.println(n);
    // System.out.println(87 - 26 - 26 - 26);
  }
}

class CaesarCipherResult {
  public static String caesarCipher(String s, int k) {
    String stringCipher = "";
    for (int i = 0; i < s.length(); i++) {
      Character letter = s.charAt(i);
      int codLetter = (int) letter;
      int n = k > 26 ? (int) Math.ceil((double) (k - 26) / 26) : 0;
      k = k - 26*n;
      if ((codLetter > 64 && codLetter < 91) || (codLetter > 96 && codLetter < 123))
        codLetter += (codLetter + k > 122) || (codLetter + k > 90 && codLetter < 97) ? k - 26 : +k;
      letter = (char) codLetter;
      stringCipher += letter;
    }
    return stringCipher;
  }
}