package week04;

public class TowerBreakers {
  public static void main(String[] args) {
    System.out.println(TowerBreakersResult.towerBreakers(2, 2));
    System.out.println(TowerBreakersResult.towerBreakers(1, 4));
  }
}

class TowerBreakersResult {
  public static int towerBreakers(int n, int m) {
    return n % 2 == 0 || m == 1 ? 2 : 1;
  }
}