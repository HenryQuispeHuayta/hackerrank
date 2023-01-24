package week04;

public class SeparateTheNumbers {
  public static void main(String[] args) {
    // String s = "123456";
    // String s = "99100101";
    // String s = "91011";
    // String s = "100410051006";
    // String s = "99100";
    // String s = "9991000";
    // String s = "13";
    // String s = "996997998999";
    // String s = "101103";
    // String s = "10001001100210031004100510061007";
    String s = "78798081828384858687888990919293";
    // String s = "8910";
    // s = s.replaceAll(s.substring(0, 1), "");
    // System.out.println(s.length());
    SeparateTheNumbersResult.separateNumbers(s);
  }
}

class SeparateTheNumbersResult {
  public static void separateNumbers(String s) {
    String numYes = "";
    boolean isValid = false;

    for (int i = 0; i < s.length() / 2; i++) {
      numYes = s.substring(0, i + 1);
      long num = Long.parseLong(numYes);
      String aux = numYes;
      while (aux.length() < s.length())
        aux += ++num;
      if (s.equals(aux)) {
        isValid = true;
        break;
      }
    }

    System.out.println(isValid ? "YES " + numYes : "NO");
  }

  // public static void separateNumbers(String s) {
  // String sBeautiful = "NO";
  // long a = 0;
  // long b = 0;
  // long num = 0;

  // String aux = s.replaceAll(s.substring(0, 1), "").length() == 0 ?
  // s.substring(0, 1) : s;

  // if (aux.substring(0, 1).equals("0") || aux.length() == 1) {
  // System.out.println("NO");
  // return;
  // }
  // int i = 0;
  // while (aux.length() > i + 1 && i < aux.length()) {
  // String num1String = aux.substring(0, i + 1);
  // a = Long.parseLong(num1String);

  // if (num1String.length() * 2 > aux.length())
  // break;

  // String num2String = (a + 1) % 10 == 0 && String.valueOf(a + 1).length() >
  // String.valueOf(a).length()
  // ? aux.substring(i + 1, 2 * i + 3)
  // : aux.substring(i + 1, 2 * i + 2);
  // b = Long.parseLong(num2String);

  // if (b == a + 1 && aux.length() == s.length())
  // num = a;
  // aux = b == a + 1 ? aux.substring(i + 1, aux.length()) : aux;
  // i = b == a + 1 ? i : i + 1;

  // // long numAux = Long.parseLong(aux);
  // // System.out.println(b==numAux);
  // if (aux.equals(String.valueOf(b)))
  // break;

  // }
  // // if (b == Long.parseLong(aux))
  // if (num > 0 && b == Long.parseLong(aux))
  // sBeautiful = "YES ";

  // if (sBeautiful.equals("YES "))
  // sBeautiful += num;

  // System.out.println(sBeautiful);

  // // long a = check(s);
  // // if (a != -1) {
  // // System.out.println("YES " + a);
  // // } else {
  // // System.out.println("NO");
  // // }
  // }

  // public static long check(String s) {
  // for (int i = 1; i < s.length() + 1 && i < 18; i++) {
  // long a = Long.parseLong(s.substring(0, i));
  // long init = a;
  // String temp = "" + a;
  // int count = 1;
  // while (temp.length() < s.length()) {
  // a++;
  // count++;
  // temp += a;
  // }
  // if (temp.equals(s) && count >= 2) {
  // return init;
  // }
  // }
  // return -1;
  // }
}
