class Ex5 {
  public static final void main(String[] argv) {
    int[][] matrix = {
      {-1, 3, 3377, -34},
      {3, 44, -2},
      {4, 3, 24}
    };
    print(matrix);

  }

  static void print(int[][] matrix) {
    for (int[] r : matrix) {
      for (int d : r) {
        System.out.printf("%8d", d);
      }
      System.out.println();
    }
    System.out.println();
  }
}