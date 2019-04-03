package classes;
/*
 * Represents a wallet with dollar bills form various denominations
 */
public class Wallet {

	private int ones;
	private int fives;
	private int tens;
	private int twenties;
	private int hundreds;

	public Wallet(int ones, int fives, int tens, int twenties, int hundreds) {
		super();
		this.ones = ones;
		this.fives = fives;
		this.tens = tens;
		this.twenties = twenties;
		this.hundreds = hundreds;
	}

	public Wallet(Wallet w) {
		this.ones = w.ones;
		this.fives = w.fives;
		this.tens = w.tens;
		this.twenties = w.twenties;
		this.hundreds = w.hundreds;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Wallet)) { return false; }
		Wallet w = (Wallet) o;
		return ((w.ones == this.ones) &&
				(w.fives == this.fives) &&
				(w.tens == this.tens) &&
				(w.twenties == this.twenties) &&
				(w.hundreds == this.hundreds));
	}

	public Wallet(int dollars) {
		this.hundreds = dollars/100;
		dollars = dollars % 100;
		this.twenties = dollars/20;
		dollars = dollars % 20;
		this.tens = dollars/10;
		dollars = dollars % 10;
		this.fives = dollars/5;
		dollars = dollars % 5;
		this.ones = dollars;
	}
	
	public int getOnes() { return ones; }
	public int getFives() { return fives; }
	public int getTens() { return tens; }
	public int getTwenties() { return twenties; }
	public int getHundreds() { return hundreds; }

	public int getAmount() {
		return this.ones + 5*this.fives + 10*this.tens + 20*this.twenties + 100*this.hundreds;
	}
	
	public Wallet add(Wallet w2) {
		this.ones += w2.ones;
		this.fives += w2.fives;
		this.tens += w2.tens;
		this.twenties += w2.twenties;
		this.hundreds += w2.hundreds;
		return this;
	}

	public Wallet add(int dollars) {
		this.hundreds += dollars/100;
		dollars = dollars % 100;
		this.twenties += dollars/20;
		dollars = dollars % 20;
		this.tens += dollars/10;
		dollars = dollars % 10;
		this.fives += dollars/5;
		dollars = dollars % 5;
		this.ones += dollars;
		return this;
	}

	public Wallet minimize() {
		while(this.ones >= 5) {
			this.ones -= 5;
			this.fives += 1;
		}
		while(this.fives >=2) {
			this.fives -= 2;
			this.tens += 1;
		}
		while(this.tens >=2) {
			this.tens -= 2;
			this.twenties += 1;
		}
		while(this.twenties >=5) {
			this.twenties -= 5;
			this.hundreds += 1;
		}
		return this;
	}
}