package week01;

import java.util.ArrayList;
import java.util.List;

public class plusminus{
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    a.add(1);
    a.add(1);
    a.add(0);
    a.add(-1);
    a.add(-1);
    Result.plusminus(a);
  }
}
class Result{
  public static void plusminus(List<Integer> arr){
    int n = arr.size();
    float nZeros = 0, nPositive = 0, nNegative = 0;

    for(int x:arr){
      if(x>0) nPositive++;
      if(x<0) nNegative++;
      if(x==0) nZeros++;
    }

    System.out.printf("%.6f \n", nPositive/n);
    System.out.printf("%.6f \n", nNegative/n);
    System.out.printf("%.6f \n", nZeros/n);
  }
}