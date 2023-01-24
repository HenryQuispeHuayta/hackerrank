package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    // arr.addAll(Arrays.asList(1,2,3,4,5));
    arr.addAll(Arrays.asList(5, 4, 3, 2));
    // arr.addAll(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761,
    // 30, 6246457, -6461594, 266854));
    // arr.addAll(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761,
    // 30, 6246457, -6461594, 266854, -520, -470));

    System.out.println(ClosestNumbersResult.closestNumbers(arr));
  }
}

class ClosestNumbersResult {
  public static List<Integer> closestNumbers(List<Integer> arr) {
    Collections.sort(arr);
    List<Integer> aux = new ArrayList<>();
    int min = 295636;
    for (int i = 0; i < arr.size() - 1; i++)
      min = Math.min(min, arr.get(i + 1) - arr.get(i));

    for (int i = 0; i < arr.size() - 1; i++) {
      if (arr.get(i) + min == arr.get(i + 1)) {
        aux.add(arr.get(i));
        aux.add(arr.get(i + 1));
      }
    }
    return aux;
  }
}