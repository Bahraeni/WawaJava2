package san.math;

public class Complex {

  private double re;

  private double im;

  public Complex(double re, double im) {
    this.re = re;
    this.im = im;
  }

  public Complex add(Complex other) {
    Complex result = new Complex(this.re + other.re, this.im + other.im);
    return result;
  }
}
