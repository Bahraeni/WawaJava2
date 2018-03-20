package san.math;

public class TestComplex {

  public static void main(String[] args) {
    Complex c1 = new Complex(1, 2);
    Complex c2 = new Complex(2, -5);
    Complex c3 = c1.add(c2);

    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    Complex c4 = new Complex();
    Complex c5 = new Complex(5);
    System.out.println("Finished");
  }

}
