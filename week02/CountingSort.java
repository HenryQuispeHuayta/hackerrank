package week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>();
    arr.addAll(Arrays.asList(1,1,3,2,1));
    System.out.println(CountingSortResult.countingSort(arr));
    // System.out.println(arr);
  }
}

class CountingSortResult{
  public static List<Integer> countingSort(List<Integer> arr) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
      result.add(i,0);
    }
    for (Integer value : arr) {
      result.set(value, result.get(value)+1);
    }
    return result;
  }
}