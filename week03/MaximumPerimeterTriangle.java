package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle {
  public static void main(String[] args) {
    List<Integer> sticks = new ArrayList<>();
    // sticks.addAll(Arrays.asList(1, 2, 3, 4, 5, 10));
    // sticks.addAll(Arrays.asList(1, 1, 1, 3, 3));
    // sticks.addAll(Arrays.asList(1, 2, 3));
    // sticks.addAll(Arrays.asList(1, 1, 1, 2, 3, 5));
    // sticks.addAll(Arrays.asList(50, 2430, 134, 6373, 215, 1502, 926, 10312, 351,
    // 74, 572, 3938));
    sticks.addAll(Arrays.asList(1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
        1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
        1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
        1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
        1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000,
        1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000));

    System.out.println(MaximumPerimeterTriangleResult.maximumPerimeterTriangule(sticks));
    // System.out.println(Collections.frequency(sticks, sticks.get(0)));
  }
}

class MaximumPerimeterTriangleResult {
  public static List<Integer> maximumPerimeterTriangule(List<Integer> sticks) {
    Collections.sort(sticks);
    int perimeter = 0;
    List<Integer> auxSticks = new ArrayList<>();
    if(Collections.frequency(sticks, sticks.get(0)) == sticks.size()) return Arrays.asList(sticks.get(0),sticks.get(0),sticks.get(0));
    for (int i = 0; i < sticks.size() - 2; i++) {
      int a = sticks.get(i);
      int b = sticks.get(i + 1);
      int c = sticks.get(i + 2);
      if ((a + b) > c) {
        auxSticks = (a + b + c) > perimeter ? sticks.subList(i, i + 3) : auxSticks;
        perimeter = a + b + c;
        
      }
    }
    if(perimeter==0) auxSticks = Arrays.asList(-1);

    return auxSticks;
  }
}