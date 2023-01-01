package week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class breakingRecords {
  public static void main(String[] args) {
    List <Integer> result = Arrays.asList(12, 24, 10, 24);
    
    System.out.println(calculateRecords.breakingRecords(result));
  }
}

class calculateRecords {
  public static List<Integer> breakingRecords(List<Integer> scores) {
    int minimum = scores.get(0), maximum = scores.get(0), min = 0, max = 0;

    for (int i = 1; i < scores.size(); i++) {
      int auxMinimum = minimum, auxMaximum = maximum;
      maximum = Math.max(maximum, scores.get(i));
      minimum = Math.min(minimum, scores.get(i));
      if(maximum != auxMaximum) max++;
      if(minimum != auxMinimum) min++;
    }

    List <Integer> records = new ArrayList<>();
    records.add(max);
    records.add(min);
    return records;
  }
  // public static List<Integer> breakingRecords(List<Integer> scores) {
  // // Write your code here
  // return scores;
  // }
}