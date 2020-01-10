class Ex3 {
  public static final void main(String[] argv) {
    int[] digits = {0, 1, 2, 3, 4};
    increment(digits);
    print(digits);
    System.out.printf("Sum = %d\n", sum(digits));
    System.out.printf("Max = %d\n", max(digits));
  }

  static void increment(int[] digits) {
    for (int i = 0; i < digits.length; i++) {
      digits[i]++;
    }
  }

  static int sum(int[] digits) {
    int sum = 0;
    for (int d : digits) {
      sum += d;
    }
    return sum;
  }

  static int max(int[] digits) {
    if (digits.length == 0) {
      return 0;
    }

    int max = digits[0];
    for (int d : digits) {
      if (d > max) {
        max = d;
      }
    }
    return max;
  }

  static void print(int[] digits) {
    for (int d : digits) {
      System.out.println(d);
    }
  }
}