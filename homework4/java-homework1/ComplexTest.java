public class ComplexTest {	
	public static void main (String[] args) {
		Complex a = new Complex(1.11, 2.22);
		Complex b = new Complex(3.33, -4.44);

		System.out.println("a = " + a);
		System.out.println();

		System.out.println("b = " + b);
		System.out.println();

		System.out.println("a + b = " + a.add(b));
		System.out.println("a - b = " + a.subtract(b));
		System.out.println("a x b = " + a.multiply(b));
		System.out.println();	
			
		Complex c = new Complex();
		Complex d = new Complex();

		System.out.println("c = " + c);
		System.out.println();

		System.out.println("d = " + d);
		System.out.println();

		//TODO
	}	
}