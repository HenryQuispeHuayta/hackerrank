package week02;

import java.util.ArrayList;
import java.util.List;

public class Pangrams {
  public static void main(String[] args) {
    System.out.println(PangramsResult.pangrams("We promptly judged antique ivory buckles for the next prize"));
    System.out.println(PangramsResult.pangrams("We promptly judged antique ivory buckles for the prize"));
  }
}

class PangramsResult {
  public static String pangrams(String s) {
    List<String> countLetters = new ArrayList<>();
    s = s.replace(" ", "").toLowerCase();
    for (int i = 0; i < s.length(); i++) {
      if (!countLetters.contains(s.substring(i, i + 1)))
        countLetters.add(s.substring(i, i + 1));
    }
    String result = countLetters.size() == 26 ? "pangram" : "not pangram";

    return result;
  }
}