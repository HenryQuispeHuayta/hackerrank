package week01;

import java.util.Scanner;

public class camelCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String s = "S;M;plasticCup()";
    // String s = "C;C;coffee machine";
    // String s = "C;M;white sheet of paper";
    // CamelCaseSol.solution(s);
    System.out.println(CamelCaseSol.combinateString("M", "coffee machine"));
    // System.out.println(s.charAt(0));
  }
}

class CamelCaseSol {
  public static void solution(String s) {
    // S (split) or C (combine)
    // M indicates method, C indicates class, and V indicates variable

    String[] splitS = s.split(";");
    if (splitS[0].equals("S")) {
      System.out.println(splitS[1]);
    } else {
      System.out.println(splitS[0]);
    }
  }

  public static String combinateString(String st, String txt) {
    String[] splitTxt = txt.split(" ");
    String txtCombinate = "";
    if (st.equals("C")) {
      txtCombinate += splitTxt[0].substring(0, 1).toUpperCase() + splitTxt[0].substring(1).toLowerCase();
    } else {
      txtCombinate += splitTxt[0].substring(0).toLowerCase();
    }
    for (int i = 1; i < splitTxt.length; i++) {
      txtCombinate += splitTxt[i].substring(0, 1).toUpperCase() + splitTxt[i].substring(1).toLowerCase();
    }
    if (st.equals("M"))
      txtCombinate += "()";
    return txtCombinate;
  }
}