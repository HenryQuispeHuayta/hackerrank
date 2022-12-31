package week01;

public class timeConverter {
  public static void main(String[] args) {
    String s = "07:05:45PM";
    System.out.println(timeConv.timeConverter(s));

  }
}

class timeConv {
  public static String timeConverter(String s) {
    String[] arrayTime = s.split(":");
    if (arrayTime[2].contains("AM") && arrayTime[0].contains("12")) {
      arrayTime[0] = "00";
      arrayTime[2] = arrayTime[2].replace("AM", "");
    }
    if (arrayTime[2].contains("PM") && !arrayTime[0].contains("12")) {
      int aux = Integer.parseInt(arrayTime[0]);
      aux = aux + 12;
      arrayTime[0] = String.valueOf(aux);
    }
    arrayTime[2] = arrayTime[2].replace("AM", "");
    arrayTime[2] = arrayTime[2].replace("PM", "");
    String out = String.join(":", arrayTime);

    return out;

  }
}
