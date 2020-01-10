class Ex2 {
  public static final void main(String[] argv) {
    int[] digits = {0, 1, 2, 3, 4};
    increment(digits);
    print(digits);
  }

  static void increment(int[] digits) {
    for (int i = 0; i < digits.length; i++) {
      digits[i]++;
    }
  }

  static void print(int[] digits) {
    for (int d : digits) {
      System.out.println(d);
    }
  }
}