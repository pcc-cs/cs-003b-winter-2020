import java.util.Arrays;

class Ex4 {
  public static final void main(String[] argv) {
    int[] digits = {-1, 3, 77};
    print(digits);

    int[] copy = digits;
    copy[2] = 10;
    print(digits);

    int[] clone = digits.clone();
    clone[2] = 20;
    print(digits);

    int[] bigger = Arrays.copyOf(digits, 2 * digits.length);
    print(bigger);
  }

  static void print(int[] digits) {
    for (int d : digits) {
      System.out.println(d);
    }
    System.out.println();
  }
}