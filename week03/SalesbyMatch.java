package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesbyMatch {
  public static void main(String[] args) {
    List<Integer> ar = new ArrayList<>();
    // ar.addAll(Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20));
    // int n = 9;
    ar.addAll(Arrays.asList(1, 1, 3, 1, 2, 1, 3, 3, 3, 3));
    int n = 10;

    System.out.println(SalesbyMatchResult.sockMerchant(n, ar));
  }
}

class SalesbyMatchResult {
  public static int sockMerchant(int n, List<Integer> ar) {
    int i = 0;
    Collections.sort(ar);
    while(ar.size()>i+1){
      if(ar.get(i) == ar.get(i+1)){
        ar.remove(i);
        ar.remove(i);
        continue;
      }
      i++;
    }

    return (n-ar.size())/2;
  }
}