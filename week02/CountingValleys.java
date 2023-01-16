package week02;

public class CountingValleys {
  public static void main(String[] args) {
    System.out.println(CountingValleysResult.countingValleys(8, "UDDDUDUU"));
  }
}

class CountingValleysResult {
  public static int countingValleys(int steps, String path) {
    int count = 0, hikes = 0;
    for (int i = 0; i < steps; i++) {
      count += path.substring(i, i + 1).equals("D") && hikes == 0 ? 1 : 0;
      hikes += path.substring(i, i + 1).equals("U") ? 1 : -1;
    }

    return count;
  }
}