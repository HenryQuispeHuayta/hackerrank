package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    a.addAll(Arrays.asList(2,6));
    b.addAll(Arrays.asList(24,36));

    System.out.println(BetweenTwoSetsResult.getTotalX(a, b));
    
    // System.out.println(BetweenTwoSetsResult.getMCD(24, 36));
    // System.out.println(BetweenTwoSetsResult.getMCM(2, 6));
  }
}

class BetweenTwoSetsResult {
  public static int getTotalX(List<Integer> a, List<Integer> b) {
    int res = 0, multiple = 0;
    int mcm = a.get(0), mcd = b.get(0);

    for (Integer integer : a) {
      mcm = getMCM(integer, mcm);
    }
    for (Integer integer : b) {
      mcd = getMCD(integer, mcd);
    }

    while(multiple<= mcd){
      multiple += mcm;
      if(mcd % multiple == 0) res++;
    }
    return res;
  }

  public static int getMCD(int a, int b) {
    int num1 = Math.min(a, b);
    int num2 = Math.max(a, b);
    int res = 0;
    while (num1 != 0) {
      res = num1;
      num1 = num2 % num1;
      num2 = res;
    }
    return res;
  }

  public static int getMCM(int a, int b) {
    int num1 = Math.min(a, b);
    int num2 = Math.max(a, b);

    return (num2 / getMCD(a, b)) * num1;
  }

  // public static List<Integer> matrixA(int numA, int maxB) {
  // int i = 1, numAdd = 0;
  // List<Integer> aux = new ArrayList<>();
  // while(numAdd<maxB){
  // numAdd= numA*i;
  // aux.add(numAdd);
  // i++;
  // }
  // return aux;
  // }
  // public static List<Integer> matrixB(int numB) {
  // List<Integer> aux = new ArrayList<>();
  // for (int i = 2; i <= numB; i++) {
  // if(numB%i == 0) aux.add(i);
  // }

  // return aux;
  // }
}