package week01;

import java.util.Scanner;

public class camelCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // String s = "S;M;plasticCup()";
    // String s = "C;C;coffee machine";
    // String s = "C;M;white sheet of paper";
    // String s = "S;V;pictureFrame";
    while(sc.hasNextLine()){
      String input = sc.nextLine();
      CamelCaseSol.solution(input);
    }
  }
}

class CamelCaseSol {
  public static void solution(String s) {
    String[] splitS = s.split(";");
    if (splitS[0].equals("S")) {
      System.out.println(splitString(splitS[1], splitS[2]));
    } else {
      System.out.println(combinateString(splitS[1], splitS[2]));
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
    return txtCombinate.trim();
  }

  public static String splitString(String st, String txt) {
    String txtSplit = "";
    int initial = 0;
    if (st.equals("M"))
      txt = txt.replace("()", "");
    for (int i = 0; i < txt.length(); i++) {
      if (Character.isUpperCase(txt.charAt(i))) {
        txtSplit += txt.substring(initial, i) + " ";
        initial = i;
      }
    }
    txtSplit += txt.substring(initial) + " ";
    txtSplit = txtSplit.toLowerCase();
    return txtSplit.trim();
  }
}