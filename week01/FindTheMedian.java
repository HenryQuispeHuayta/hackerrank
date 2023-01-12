package week01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian {
  public static void main(String[] args) {
    List<Integer> result = Arrays.asList(0,1,2,4,6,5,3);
    System.out.println(FindTheMedianResult.findMedian(result));
  }
}

class FindTheMedianResult{
  public static int findMedian(List<Integer> arr) {
    Collections.sort(arr);
    int median = arr.size() / 2;
    return arr.get(median);
  }
}