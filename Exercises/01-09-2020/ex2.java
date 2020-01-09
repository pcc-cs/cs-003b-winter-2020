class Ex2 {
  public static final int SECONDS_IN_HOUR = 60 * 60;
  public static final void main(String[] argv) {
    System.out.println(24 * SECONDS_IN_HOUR);

    double v1 = Math.sqrt(2);
    System.out.println(v1);
    System.out.println(Math.pow(v1, 2.0));

    int v2 = 3;
    int v3 = 2;
    System.out.println((double) v2 / v3);

    double v4 = v2;
    System.out.println(v4 / v3);

    System.out.println(Math.round(v4 / v3));
  }
}
