package week01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DivisibleSumPairs {
  public static void main(String[] args) {
    List<Integer> result = Arrays.asList(1, 3, 2, 6, 1, 2);
    // List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6);
    int out = DivisibleSumPairsResult.divisibleSumPairs(6, 3, result);
    System.out.println(out);
    // 5 / 2 = 2 -> 5 - 2*2 = 1
    // (1 + j) = n*3
    // (1 + j) mod 3 = 0
    // DivisibleSumPairsResult.test(3, result);
  }
}

class DivisibleSumPairsResult {
  public static void test(int k, List<Integer> ar) {
    for (Integer integer : ar) {
      int mod = integer % k;
      int c = k - mod;
      if (k - mod == k)
        c = 0;
      System.out.println(mod + " : " + c);
    }
  }

  public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int count = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (Integer value : ar) {
      int mod = value % k;
      int complement = k - mod;
      if (k - mod == k)
        complement = 0;
      if (map.containsKey(complement))
        count += map.get(complement);
      if (map.containsKey(mod)) {
        map.put(mod, map.get(mod) + 1);
      }
      if (!map.containsKey(mod)) {
        map.put(mod, 1);
      }
    }
    // for (int i = 0; i < ar.size(); i++) {
    // for (int j = i + 1; j < ar.size(); j++) {
    // if ((i + j) % k == 0)
    // count++;
    // }
    // }
    return count;
  }
}