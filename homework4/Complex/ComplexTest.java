package ntou.cs.java2024;
import ntou.cs.java2024.Complex;
//javac -d . ComplexTest.java
//java ntou.cs.java2024.ComplexTest
public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(1.10, 2.20);
        Complex b = new Complex(3.30, -4.40);

        System.out.println("a = " + a);
        System.out.println("Conjugates of a = " + a.conjugate());
        System.out.println("Absolute value of a = " + String.format("%.2f", a.absoluteValue()));
        System.out.println();

        System.out.println("b = " + b);
        System.out.println("Conjugates of b = " + b.conjugate());
        System.out.println("Absolute value of b = " + String.format("%.2f", b.absoluteValue()));
        System.out.println();

        System.out.println("a + b = " + a.add(b));
        System.out.println("a - b = " + a.subtract(b));
        System.out.println("a x b = " + a.multiply(b));
        System.out.println("a / b = " + a.divide(b));
        System.out.println();   

        Complex c = new Complex(0.29, 0.46);
        Complex d = new Complex(0.79, 0.68);

        System.out.println("c = " + c);
        System.out.println("Conjugates of c = " + c.conjugate());
        System.out.println("Absolute value of c = " + String.format("%.2f", c.absoluteValue()));
        System.out.println();

        System.out.println("d = " + d);
        System.out.println("Conjugates of d = " + d.conjugate());
        System.out.println("Absolute value of d = " + String.format("%.2f", d.absoluteValue()));
        System.out.println();

        System.out.println("c + d = " + c.add(d));
        System.out.println("c - d = " + c.subtract(d));
        System.out.println("c x d = " + c.multiply(d));
        System.out.println("c / d = " + c.divide(d));
	}
}