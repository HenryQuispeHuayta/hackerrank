package week05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    // arr.addAll(Arrays.asList(1, 2, 3, 4, 10, 20, 30, 40, 100, 200));
    arr.addAll(Arrays.asList(4504, 1520, 5857, 4094, 4157, 3902, 822, 6643, 2422, 7288, 8245, 9948, 2822, 1784, 7802,
        3142, 9739, 5629, 5413, 7232));
    System.out.println(MaxMinResult.maxMin(5, arr));
  }
}

class MaxMinResult {
  public static int maxMin(int k, List<Integer> arr) {
    int unfairness = 1000000000;
    Collections.sort(arr);
    for (int i = 0; i < arr.size() - k + 1; i++) {
      List<Integer> aux = arr.subList(i, i + k);
      int max = aux.get(aux.size() - 1);
      int min = aux.get(0);
      unfairness = Math.min(unfairness, max - min);
    }

    return unfairness;
  }
}