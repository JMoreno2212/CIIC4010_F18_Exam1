public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public int gcd(int a, int b) {
		if (a % b == 0) return b;
		return gcd(b, a%b);
	}

	public Fraction minimize() {
		int newNumerator = this.numerator;
		int newDenominator = this.denominator;
		int common = gcd(newNumerator, newDenominator);
		if(common > 1) {
			newNumerator = newNumerator /= common;
			newDenominator = newDenominator /= common;
		}
		Fraction newFraction = new Fraction(newNumerator, newDenominator);
		return newFraction;
	}
	
	public Fraction add(Fraction f2) {
		int resultNum = (this.numerator * f2.denominator) + (f2.numerator * this.denominator);
		int resultDen = this.denominator * f2.denominator;
		Fraction result = new Fraction(resultNum, resultDen);
		return result;
	}

	public Fraction subtract(Fraction f2) {
		int resultNum = (this.numerator * f2.denominator) - (f2.numerator * this.denominator);
		int resultDen = this.denominator * f2.denominator;
		Fraction result = new Fraction(resultNum, resultDen);
		return result;
	}

	public Fraction multiply(Fraction f2) {
		int resultNum = this.numerator * f2.numerator;
		int resultDen = this.denominator * f2.denominator;
		Fraction result = new Fraction(resultNum, resultDen);
		return result;
	}

	public Fraction divide(Fraction f2) {
		int resultNum = this.numerator * f2.denominator;
		int resultDen = this.denominator * f2.numerator;
		Fraction result = new Fraction(resultNum, resultDen);
		return result;
	}

}