package week04;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.List;

public class LeftRotation {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr.addAll(Arrays.asList(1, 2, 3, 4, 5));

    System.out.println(LeftRotationResult.rotateLeft(1, arr));
  }
}

class LeftRotationResult {
  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Collections.reverse(arr);
    // Collections.rotate(arr, d);
    // Collections.reverse(arr);

    // for (int i = 0; i < d; i++)
    //   arr.add(arr.remove(0));

    // return arr;

    int n = d > arr.size() ? d - arr.size() : d;
    List<Integer> aux = arr.subList(n, arr.size());
    aux.addAll(arr.subList(0, n));
    return aux;

  }
}