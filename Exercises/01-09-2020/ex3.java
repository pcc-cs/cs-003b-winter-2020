import java.util.Scanner;

class Ex3 {
  public static final void main(String[] argv) {
    Scanner s = new Scanner(System.in);

    String line = s.nextLine();
    System.out.println(line);

    int count = s.nextInt();
    System.out.println(count);

    System.out.printf("%-16s%-8d\n", line, count);

    s.close();
  }
}
