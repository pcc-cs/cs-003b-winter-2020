import java.util.ArrayList;
import java.util.Random;

class Ex6 {
  public static final void main(String[] argv) {
    Random generator = new Random(System.currentTimeMillis());

    ArrayList<Long> numbers = new ArrayList<>();

    numbers.add(10l);
    numbers.add(-2l);
    numbers.add(25l);
    System.out.printf("Size = %d\n", numbers.size());
    print(numbers);

    numbers.add(1, 100l);
    System.out.printf("Size = %d\n", numbers.size());
    print(numbers);

    numbers.remove(2);
    System.out.printf("Size = %d\n", numbers.size());
    print(numbers);

    ArrayList<ArrayList<Long>> matrix = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      ArrayList<Long> r = new ArrayList<>();
      for (int j = 0; j < 5; j++) {
        r.add(generator.nextLong() % 1000);
      }
      matrix.add(r);
    }
    print2d(matrix);
  }

  static void print(ArrayList<Long> digits) {
    for (long d : digits) {
      System.out.println(d);
    }
    System.out.println();
  }

  static void print2d(ArrayList<ArrayList<Long>> matrix) {
    for (ArrayList<Long> r : matrix) {
      for (long d : r) {
        System.out.printf("%8d", d);
      }
      System.out.println();
    }
    System.out.println();
  }
}