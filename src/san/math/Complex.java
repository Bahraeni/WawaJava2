package san.math;

public class Complex {

  private final double re;

  private final double im;

  public Complex() {
    this(0, 0);
  }

  public Complex(double x) {
    this(x, 0);
  }

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public Complex add(Complex other) {
    Complex result = new Complex(this.re + other.re, this.im + other.im);
    return result;
  }
}
