import java.util.Random;

class Ex5 {
  public static final void main(String[] argv) {
    Random generator = new Random(System.currentTimeMillis());
    int a = generator.nextInt() % 10;

    System.out.println(a);

    if (a > 7) {
      System.out.println("Big");
    }

    if (a > 7) {
      System.out.println("Big");
    } else {
      System.out.println("Not big");
    }

    if (a > 7) {
      System.out.println("Big");
    } else if (a > 3) {
      System.out.println("Medium");
    } else {
      System.out.println("Small");
    }
  }
}
