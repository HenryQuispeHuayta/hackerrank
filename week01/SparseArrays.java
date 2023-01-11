package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SparseArrays {
  public static void main(String[] args) {
    // List<String> strings = Arrays.asList("aba", "baba", "aba", "xzxb");
    // List<String> queries = Arrays.asList("aba", "xzxb", "ab");
    List<String> strings = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn", "sdaklfj", "asdjf", "na", "asdjf",
        "na", "basdn", "sdaklfj", "asdjf");
    List<String> queries = Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn");
    System.out.println(SparseArraysResult.matchingStrings(strings, queries));
    // System.out.println(strings);
    // for (String string : strings) {
    // System.out.println(queries.contains(string));
    // }
  }
}

class SparseArraysResult {

  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    List<Integer> result = new ArrayList<>();
    for (String str : queries) {
      result.add(count(str, strings));
    }
    return result;
  }

  public static int count(String str, List<String> list) {
    int count = 0;
    for (String s : list) {
      if (s.equals(str)) {
        count++;
      }
    }
    return count;
  }
  // LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
  // for (String querie : queries) {
  // map.put(querie, 0);
  // }
  // for (String string : strings) {
  // if (queries.contains(string)) {
  // int count = map.get(string) == null ? 0 : map.get(string);
  // map.put(string, count + 1);
  // }
  // }

  // List<Integer> result = new ArrayList<>(map.values());
  // return result;
  // }
}
