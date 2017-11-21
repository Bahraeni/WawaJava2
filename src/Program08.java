public class Program08 {

  public static void main(String[] args) {
//    double x = 1.0 / 3.0;
//    double y = 3.0 / 4.0;
//    double z = x + y;
//
//    System.out.println(z);
//    System.out.println(2.00 - 1.10);
//
//    double w = 0.0 / 0.0;
//    System.out.println(w == w);
//
//    System.out.println(Ratios.toString(Ratios.cons(1, 3)));

    Object x = Ratios.cons(5, 2);
    Object y = Ratios.cons(2, -4);
    System.out.println(Ratios.toString(x));
    System.out.println(Ratios.toString(y));

    Object z = Ratios.add(x, y);
    System.out.println(Ratios.toString(z));
    System.out.println(Ratios.gcd(-61524654, 54132));

    Object w = Ratios.cons(-61524654,54132);
    System.out.println(Ratios.toString(w));
    System.out.println(Ratios.toDouble(w));

//    System.out.println(Ratios.toString(Ratios.cons(4,   5)));
//    System.out.println(Ratios.toString(Ratios.cons(-4,  5)));
//    System.out.println(Ratios.toString(Ratios.cons(4,  -5)));
//    System.out.println(Ratios.toString(Ratios.cons(-4, -5)));

  }

}
