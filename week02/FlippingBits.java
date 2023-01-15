package week02;


public class FlippingBits {
  public static void main(String[] args) {
    long n = 2147483647;
    System.out.println(FlippingBitsResult.flippingBits(n));
  }
}

class FlippingBitsResult {
  public static long flippingBits(long n) {
    String binary = Long.toBinaryString(n);
    if (binary.length() < 32) {
      StringBuilder auxString = new StringBuilder(binary);
      for (int i = 0; i < 32 - binary.length(); i++) {
        auxString.insert(0, "0");
      }
      binary = auxString.toString();
    }
    String binaryFlipping = "";
    String[] converterBinary = binary.split("");
    for (int i = 0; i < converterBinary.length; i++) {
      if (converterBinary[i].equals("1"))
        binaryFlipping += "0";
      if (converterBinary[i].equals("0"))
        binaryFlipping += "1";
    }

    long outFlipping = 0;
    // Integer.to
    // long c = n;
    // while (c >= 1) {
    // long a = c / 2;
    // long b = c % 2;
    // if (b == 0 && c==1)
    // b = 1;
    // binary += b;
    // c = a;
    // }
    outFlipping = Long.parseLong(binaryFlipping, 2);
    return outFlipping;
  }
}