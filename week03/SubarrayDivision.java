package week03;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
  public static void main(String[] args) {
    List<Integer> s = Arrays.asList(2, 2, 1, 3, 2);
    int d= 4;
    int m =2;
    // List<Integer> s = Arrays.asList(4);
    // int d= 4;
    // int m =1;
    System.out.println(s.subList(0, 1));

    System.out.println(SubarrayDivisionResult.birthday(s, d, m));

  }
}

class SubarrayDivisionResult {
  public static int birthday(List<Integer> s, int d, int m) {
    int i = 0;
    int count = 0;
    if(s.size()==1 && s.get(0) == d) return 1;
    while (i + m <= s.size()) {
      List<Integer> aux = s.subList(i, i + m);
      int sum = aux.stream().mapToInt(Integer::intValue).sum();
      if (sum == d)
        count++;
      i++;
    }
    return count;
  }
}