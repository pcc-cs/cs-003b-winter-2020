import java.awt.Rectangle;

class Ex8 {
  public static final void main(String[] argv) {
    Rectangle a = new Rectangle(1, 2, 30, 40);
    Rectangle b = new Rectangle(1, 2, 30, 40);
    Rectangle c = a;

    if (a == b) {
      System.out.println("a/b: Equal!");
    }

    if (a == c) {
      System.out.println("a/c: Equal");
    }

    if (a.equals(b)) {
      System.out.println("a/b (using equals): Equal!");
    }

    if (a == b || a == c) {
      System.out.println("We hava a match!");
    }
  }
}
