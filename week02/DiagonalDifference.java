package week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
  public static void main(String[] args) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    res.addAll(Arrays.asList(Arrays.asList(11, 12, 4), Arrays.asList(4, 5, 6), Arrays.asList(10, 8, -12)));
    System.out.println(DiagonalDifferenceResult.diagonalDifference(res));
  }
}

class DiagonalDifferenceResult {
  public static int diagonalDifference(List<List<Integer>> arr) {
    int primaryDiagonal = 0, secondaryDiagonal = 0;
    for (int i = 0; i < arr.size(); i++) {
      primaryDiagonal += arr.get(i).get(i);
      secondaryDiagonal += arr.get(arr.size() - i - 1).get(i);
    }

    return Math.abs(primaryDiagonal - secondaryDiagonal);
  }
}