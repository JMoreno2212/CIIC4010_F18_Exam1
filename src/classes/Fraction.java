package classes;
public class Fraction {
	
	private int numerator, denominator;
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	// Getters
	public int getNumerator() {return numerator;}
	public int getDenominator() {return denominator;}
	
	// Finds greatest common divisor
	public int gcd(int a, int b) {
		if (a % b == 0) return b;
		return gcd(b, a % b);
	}

	public Fraction minimize() {
		// YOUR CODE HERE
		return null; // Dummy return
	}
	
	public Fraction add(Fraction f2) {
		// YOUR CODE HERE
		return null; // Dummy return
	}

	public Fraction subtract(Fraction f2) {
		// YOUR CODE HERE
		return null; // Dummy return
	}

	public Fraction multiply(Fraction f2) {
		// YOUR CODE HERE
		return null; // Dummy return
	}

	public Fraction divide(Fraction f2) {
		// YOUR CODE HERE
		return null; // Dummy return
	}

}