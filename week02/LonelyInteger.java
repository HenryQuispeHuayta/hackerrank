package week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {
  public static void main(String[] args) {
    List<Integer> result = new ArrayList<Integer>();
    result.addAll(Arrays.asList(1, 2, 3, 4, 3, 2, 1));
    System.out.println(LonelyIntegerResult.lonelyInteger(result));
  }
}

class LonelyIntegerResult {
  public static int lonelyInteger(List<Integer> a) {
    Map<Integer, Integer> mapInteger = new HashMap<>();
    for (Integer integer : a) {
      if (!mapInteger.containsKey(integer))
        mapInteger.put(integer, 0);
      mapInteger.put(integer, mapInteger.get(integer) + 1);
    }
    int lonely = mapInteger.keySet().stream().filter(key -> 1 == mapInteger.get(key)).findFirst().get();

    return lonely;
  }
}