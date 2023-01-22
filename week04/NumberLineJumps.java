package week04;

public class NumberLineJumps {
  public static void main(String[] args) {
    // System.out.println(NumberLineJumpsResult.kangaroo(0, 2, 5, 3));
    // System.out.println(NumberLineJumpsResult.kangaroo(0, 3, 4, 2));
    // System.out.println(NumberLineJumpsResult.kangaroo(23, 9867, 9814, 5861));
    // System.out.println(NumberLineJumpsResult.kangaroo(43, 2, 70, 2));
    System.out.println(NumberLineJumpsResult.kangaroo(4, 2, 3, 2));
  }
}

class NumberLineJumpsResult {
  public static String kangaroo(int x1, int v1, int x2, int v2) {
    int x = x1 - x2;
    int v = v2 - v1;
    if(x==0 && v ==0) return "YES";
    int xAbs = Math.abs(x);
    int vAbs = Math.abs(v);
    int mod = v!=0 ? (Math.max(xAbs, vAbs) % Math.min(xAbs, vAbs)) : -1;
    int n = mod != 0 ? 0 : x / v;

    // for (int i = 0; i < 10000; i++) {
    // x1 += v1;
    // x2 += v2;
    // if(x1==x2) return "YES";
    // }

    // return "NO";

    return n > 0 ? "YES" : "NO";
  }
}

// 0 3 6 9 12
// 4 6 8 10 12

// 0 2 4 6
// 5 8 11 14

// x1 +v1*n = x2+v2*n
// x1 - x2 = n(v2-v1)
// n = (x1 - x2)/(v2 - v1)
// n = 0 - 5 / 5 - 2