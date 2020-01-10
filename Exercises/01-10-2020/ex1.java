class Ex1 {
  public static final void main(String[] argv) {
    double[] numbers = new double[5];
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("numbers[%d] = %6.2f\n", i, numbers[i]);
    }
    for (double n : numbers) {
      System.out.println(n);
    }

    int[] digits = {0, 1, 2, 3, 4, 5};
    for (int d : digits) {
      System.out.println(d);
    }
  }
}