package week01;

import java.util.ArrayList;
import java.util.List;

public class minMaxSum {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    a.add(256741038);
    a.add(623958417);
    a.add(467905213);
    a.add(714532089);
    a.add(938071625);
    minMaxS.minMax(a);
  }

}

class minMaxS {
  public static void minMax(List<Integer> arr) {
    arr.sort((n1, n2) -> n1.compareTo(n2));
    long sumMin = 0, sumMax = 0;
    for (int i = 0; i < arr.size()-1; i++) {
      sumMin = sumMin + arr.get(i);
      sumMax = sumMax + arr.get(i+1);
    }
    System.out.println(arr);
    System.out.println(sumMin+ " "+ sumMax);
  }
}