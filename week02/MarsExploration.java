package week02;

public class MarsExploration {
  public static void main(String[] args) {
    System.out.println(MarsExplorationResult.marsExploration("SOSSPSSQSSOR"));
    System.out.println(MarsExplorationResult.marsExploration("SOSSOT"));
  }
}

class MarsExplorationResult {
  public static int marsExploration(String s) {
    int count = 0;
    String sos = "SOS";
    for (int i = 0; i < s.length(); i += 3) {
      count += (s.charAt(i) == sos.charAt(0)) ? 0 : 1;
      count += (s.charAt(i + 1) == sos.charAt(1)) ? 0 : 1;
      count += (s.charAt(i + 2) == sos.charAt(2)) ? 0 : 1;
    }

    return count;
  }
}