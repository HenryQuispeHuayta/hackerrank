package week05;

// import java.util.List;
// import java.util.stream.Collectors;

public class StrongPassword {
  public static void main(String[] args) {
    System.out.println(StrongPasswordResult.minimumNumber(11, "#HackerRank"));
    System.out.println(StrongPasswordResult.minimumNumber(3, "Ab1"));
    System.out.println(StrongPasswordResult.minimumNumber(2, "1a"));
  }
}

class StrongPasswordResult {
  public static int minimumNumber(int n, String password) {
    int minimum = 0;
    // List<String> numbers = "0123456789".chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());
    // List<String> lowerCase = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> String.valueOf((char) c))
    //     .collect(Collectors.toList());
    // List<String> upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().mapToObj(c -> String.valueOf((char) c))
    //     .collect(Collectors.toList());
    // List<String> specialChar = "!@#$%^&*()-+".chars().mapToObj(c -> String.valueOf((char) c))
    //     .collect(Collectors.toList());
    // List<String> pass = password.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toList());
    // numbers.retainAll(pass);
    // lowerCase.retainAll(pass);
    // upperCase.retainAll(pass);
    // specialChar.retainAll(pass);
    // if (numbers.isEmpty())
    //   minimum++;
    // if (lowerCase.isEmpty())
    //   minimum++;
    // if (upperCase.isEmpty())
    //   minimum++;
    // if (specialChar.isEmpty())
    //   minimum++;
    // return minimum + n > 5 ? minimum : 6 - n;

    if(!password.matches(".*[a-z].*")) minimum++;
    if(!password.matches(".*[A-Z].*")) minimum++;
    if(!password.matches(".*[0-9].*")) minimum++;
    if(!password.matches(".*[!@#$%^&*()-+].*")) minimum++;

    return Math.max(6 - n, minimum);
  }
}