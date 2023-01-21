package week03;

public class DrawingBook {
  public static void main(String[] args) {
    // 1  23  45  67  89  1011  1213  1415  1617
    int n = 16;
    int p = 2; //3
    System.out.println(DrawingBookResult.pageCount(n, p));
  }
}

class DrawingBookResult {
  public static int pageCount(int n, int p) {
    int countStart = 0, countFinal = 0;
    if (n % 2 == 0)
      n++;
    int i = 1;
      while(i<n){
        if(p>i) countStart++;
        if(n-i>p) countFinal++;
        i+=2;
    }

    return Math.min(countStart, countFinal);
  }
}