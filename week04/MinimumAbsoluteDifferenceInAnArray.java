package week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {
  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    // arr.addAll(Arrays.asList(3, -7, 0));
    // arr.addAll(Arrays.asList(1, -3, 71, 68, 17));
    arr.addAll(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75));
    System.out.println(MinimunAbsoluteResult.minimumAbsoluteDifference(arr));
  }
}

class MinimunAbsoluteResult{
  public static int minimumAbsoluteDifference(List<Integer> arr) {
    Collections.sort(arr);
    int min = 1000000000;
    for (int i = 0; i < arr.size()-1; i++) {
      int abs = Math.abs(arr.get(i)-arr.get(i+1));
      min = Math.min(min, abs);
    }
    
    return min;
  }
}