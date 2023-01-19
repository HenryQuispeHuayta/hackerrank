package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    // arr.addAll(Arrays.asList(1, 4, 4, 4, 5, 3));
    arr.addAll(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));

    System.out.println(MigratoryBirdsResult.migratoryBirds(arr));
  }
}

class MigratoryBirdsResult {
  public static int migratoryBirds(List<Integer> arr) {
    Collections.sort(arr);
    LinkedHashMap<Integer, Integer> mapBirds = new LinkedHashMap<>();
    for (Integer integer : arr) {
      if (!mapBirds.containsKey(integer))
        mapBirds.put(integer, 0);
      mapBirds.put(integer, mapBirds.get(integer)+1);
    }

    return Collections.max(mapBirds.entrySet(), Map.Entry.comparingByValue()).getKey();
  }
}