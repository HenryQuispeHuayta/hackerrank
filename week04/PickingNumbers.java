package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    // a.addAll(Arrays.asList(6, 6, 2, 2, 4, 4, 5, 5, 5));
    a.addAll(Arrays.asList(6, 6, 6, 6, 6, 6));
    // a.addAll(Arrays.asList(4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5, 97, 97, 97,
    //     5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4, 97, 97, 4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4,
    //     97, 97, 5, 4, 97, 97, 4, 97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4, 97, 5, 97, 5, 4, 97, 4, 5, 97,
    //     97, 5, 97, 5, 97, 5, 97, 97, 97));

    // System.out.println(a);
    // Collections.reverse(a);
    // System.out.println(a);
    System.out.println(PickingNumbersResult.pickingNumbers(a));
  }
}

class PickingNumbersResult {
  public static int pickingNumbers(List<Integer> a) {
    int length = 0;
    Map<Integer, Integer> count = new HashMap<>();
    for (Integer integer : a) {
      if (!count.containsKey(integer))
        count.put(integer, 0);
      count.put(integer, count.get(integer) + 1);
    }
    for (int i = 1; i < 101; i++)
      if (!count.containsKey(i))
        count.put(i, 0);

    // System.out.println(count);
    // if (count.size() == 1)
    //   return count.values().stream().reduce(0, Integer::sum);
    for (int i = 1; i < 100; i++) {
      if (count.containsKey(i) && count.containsKey(i + 1))
        length = Math.max(length, count.get(i) + count.get(i + 1));
    }
    return length;
  }
}
