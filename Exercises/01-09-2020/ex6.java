import java.util.Random;

class Ex6 {
  static final double EPSILON = 0.5;
  public static final void main(String[] argv) {
    Random generator = new Random(System.currentTimeMillis());
    float a1 = generator.nextFloat() * 3;
    float a2 = generator.nextFloat() * 3;

    System.out.printf("a1 = %f, a2 = %f\n", a1, a2);

    if (a1 == a2) {
      System.out.println("Equal!");
    } else {
      System.out.println("Not equal!");
    }

    if (Math.abs(a1 - a2) < EPSILON) {
      System.out.println("Equal!");
    }
  }
}
