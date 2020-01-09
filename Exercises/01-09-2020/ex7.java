import java.util.Scanner;

class Ex7 {
  public static final void main(String[] argv) {
    Scanner s = new Scanner(System.in);

    String a = "Hello";
    String b = "Hello";
    String c = s.next();

    if (a == b) {
      System.out.println("Equal!");
    }

    if (a == c) {
      System.out.println("Equal!");
    } else {
      System.out.println("Not equal!");
    }

    if (a.equals(c)) {
      System.out.println("Equal!");
    } else {
      System.out.println("Not equal!");
    }

    s.close();
  }
}
