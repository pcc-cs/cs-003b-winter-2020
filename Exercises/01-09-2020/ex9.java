class Ex9 {
  public static final void main(String[] argv) {
    int a = 0;
    while (a < 5) {
      System.out.println(a);
      a++;
    }
    System.out.println();
    
    System.out.println("Continuing...");
    while (a < 7) {
      System.out.println(a);
      a++;
    }
    System.out.println();

    a = 0;
    while (a < 5) {
      a++;
      System.out.println(a);
    }
    System.out.println();

    for (int b = 0; b < 5; b++) {
      System.out.println(b);
    }
    System.out.println();

    a = 0;
    do {
      System.out.println(a);
      a++;
    } while (a < 5);
    System.out.println();

    do {
      System.out.println(a);
      a++;
    } while (a < 5);
    System.out.println();

    for (a = 0; a < 10; a++) {
      if (a == 3) {
        continue;
      }
      if (a == 5) {
        break;
      }
      System.out.println(a);
    }
    System.out.println();

    System.out.printf("a (after loop): %d\n", a);
  }
}
