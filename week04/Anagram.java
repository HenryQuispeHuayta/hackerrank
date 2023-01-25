package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
  public static void main(String[] args) {
    // String s = "AAABBB";
    String s = "fdhlvosfpafhalll";
    System.out.println(AnagramResult.anagram(s));
  }
}

class AnagramResult{
  public static int anagram(String s) {
    if(s.length()%2==1) return -1;

    String s1 = s.substring(0, s.length()/2);
    String s2 = s.substring(s.length()/2, s.length());

    List<String> stringS1 = new ArrayList<>();
    stringS1.addAll(Arrays.asList(s1.split("")));

    List<String> stringS2 = new ArrayList<>();
    stringS2.addAll(Arrays.asList(s2.split("")));

    for (String string : stringS2) {
      stringS1.remove(string);
    }

    return stringS1.size();
  }
}