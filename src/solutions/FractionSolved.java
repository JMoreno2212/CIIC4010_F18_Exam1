package solutions;

public class FractionSolved {
	
	private int numerator, denominator;
	
	public FractionSolved(int numerator, int denominator) {
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

	public FractionSolved minimize() {
		int newNumerator = this.numerator;
		int newDenominator = this.denominator;
		int common = gcd(newNumerator, newDenominator);
		if(common > 1) {
			newNumerator = newNumerator /= common;
			newDenominator = newDenominator /= common;
		}
		FractionSolved newFraction = new FractionSolved(newNumerator, newDenominator);
		return newFraction;
	}
	
	public FractionSolved add(FractionSolved f2) {
		int resultNum = (this.numerator * f2.denominator) + (f2.numerator * this.denominator);
		int resultDen = this.denominator * f2.denominator;
		FractionSolved result = new FractionSolved(resultNum, resultDen);
		return result;
	}

	public FractionSolved subtract(FractionSolved f2) {
		int resultNum = (this.numerator * f2.denominator) - (f2.numerator * this.denominator);
		int resultDen = this.denominator * f2.denominator;
		FractionSolved result = new FractionSolved(resultNum, resultDen);
		return result;
	}

	public FractionSolved multiply(FractionSolved f2) {
		int resultNum = this.numerator * f2.numerator;
		int resultDen = this.denominator * f2.denominator;
		FractionSolved result = new FractionSolved(resultNum, resultDen);
		return result;
	}

	public FractionSolved divide(FractionSolved f2) {
		int resultNum = this.numerator * f2.denominator;
		int resultDen = this.denominator * f2.numerator;
		FractionSolved result = new FractionSolved(resultNum, resultDen);
		return result;
	}

}