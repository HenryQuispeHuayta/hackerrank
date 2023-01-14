package week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
  public static void main(String[] args) {
    List<Integer> result = new ArrayList<Integer>();
    result.addAll(Arrays.asList(73,67,38,33));
    System.out.println(GradingStudentsResult.grandingStudents(result));
  }
}

class GradingStudentsResult {
  public static List<Integer> grandingStudents(List<Integer> grades) {
    // for (Integer value : grades) {
    // if (value > 37 && value % 5 < 3) {
    // grades.sort(null);
    // }
    // }
    for (int i = 0; i < grades.size(); i++) {
      int value = grades.get(i);
      for (int j = 1; j < 3; j++) {
        int newValue = value+j;
        if(newValue%5==0 && value>37)
          grades.set(i, newValue);

      }
      // int mod = value%5;
      // if (value > 37 && mod < 3) {
        // grades.set(i, mod);
      // }
    }

    return grades;
  }
}