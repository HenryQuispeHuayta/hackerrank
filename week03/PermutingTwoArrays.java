package week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class PermutingTwoArrays {
  public static void main(String[] args) {
    List<Integer> A = new ArrayList<Integer>();
    List<Integer> B = new ArrayList<Integer>();
    int k = 10;
    A.addAll(Arrays.asList(2, 1, 3));
    B.addAll(Arrays.asList(7, 8, 9));
    // int k = 5;
    // A.addAll(Arrays.asList(1, 2, 2, 1));
    // B.addAll(Arrays.asList(3, 3, 3, 4));
    // int k = 10;
    // A.addAll(Arrays.asList(7, 6, 8, 4, 2));
    // B.addAll(Arrays.asList(5, 2, 6, 3, 1));
    System.out.println(PermutingTwoArraysResult.twoArrays(k, A, B));
  }
}

class PermutingTwoArraysResult {
  // public static HashMap<Integer,Integer> twoArrays(int k, List<Integer> A,
  // List<Integer> B) {
  // public static List<Integer> twoArrays(int k, List<Integer> A, List<Integer> B) {
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    List<Integer> aux = new ArrayList<Integer>();
    // HashMap<Integer, Integer> auxMap = new HashMap<Integer, Integer>();
    // HashMap<Integer, Integer> mapB = new HashMap<Integer, Integer>();
    // for (Integer value : B) {
    // if (!mapB.containsKey(value))
    // mapB.put(value, 0);
    // mapB.put(value, mapB.get(value) + 1);
    // }
    // B.forEach(value -> !mapB.containsKey(value) ? mapB.put(value, 0):
    // mapB.put(value, mapB.get(value)+1));
    // A.forEach(value -> aux.add(k-value));

    // for (Integer value : A) {
    // int data = k - value;
    // if (!auxMap.containsKey(data))
    // auxMap.put(data, 0);
    // auxMap.put(data, auxMap.get(data) + 1);
    // }
    // Collections.sort(A);
    // Collections.reverse(B);
    // // String output = "YES";
    // for (int i = 0; i < A.size(); i++) {
    // if(A.get(i)+B.get(i)< k) return "NO";
    // }
    // return "YES";

    // return output;
    // for (Integer integer : A) {
    // aux.add(k-integer);
    // }
    // String output= "";
    // for (int i = 0; i < A.size(); i++) {
    //   for (int j = 0; j < B.size(); j++) {
    //     if(A.get(i) + B.get(j) < k) return "NO";
    //     // output = A.get(i) + B.get(j) >= k ?"YES":"NO";
    //   }
    // }

    // return "YES";
    // return A.isEmpty() && B.isEmpty() ? "YES" : "NO";
    // return auxMap.equals(mapB) ? "YES" : "NO";
    // return auxMap;
    Collections.sort(A);
    Collections.sort(B);
    int iA = 0;
    int iB = B.size()-1;
    while(iA<A.size() && iB >= 0){
        if(A.get(iA) + B.get(iB) < k) return "NO";
        iA++;
        iB--;
    }
    return "YES";

  }
}
