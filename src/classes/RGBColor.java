package classes;
public class RGBColor {

	private long red;
	private long green;
	private long blue;

	public RGBColor(long red, long green, long blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public RGBColor(RGBColor c2) {
		this.red = c2.red;
		this.green = c2.green;
		this.blue = c2.blue;
	}

	public long getRed() {
		return red;
	}

	public long getGreen() {
		return green;
	}

	public long getBlue() {
		return blue;
	}

	public boolean equals(Object o) {
		if (!(o instanceof RGBColor)) { return false; }
		RGBColor c = (RGBColor) o;
		return ((c.red == this.red) &&
				(c.green == this.green) &&
				(c.blue == this.blue));
	}

	public RGBColor add(RGBColor color2) {
		long finalRed = this.red + color2.red;
		long finalGreen = this.green + color2.green;
		long finalBlue = this.blue + color2.blue;
		if(finalRed > 255) { finalRed = 255; }
		if(finalGreen > 255) { finalGreen = 255; }
		if(finalBlue > 255) { finalBlue = 255; }
		RGBColor finalColor = new RGBColor(finalRed, finalGreen, finalBlue);
		return finalColor;
	}

	public RGBColor subtract(RGBColor color2) {
		long finalRed = this.red - color2.red;
		long finalGreen = this.green - color2.green;
		long finalBlue = this.blue - color2.blue;
		if(finalRed < 0) { finalRed = 0; }
		if(finalGreen < 0) { finalGreen = 0; }
		if(finalBlue < 0) { finalBlue = 0; }
		RGBColor finalColor = new RGBColor(finalRed, finalGreen, finalBlue);
		return finalColor;
	}

	public RGBColor complement() {
		long complementRed = 255 - this.red;
		long complementGreen = 255 - this.green;
		long complementBlue = 255 - this.blue;
		if(complementRed > 255) { complementRed = 255; }
		else if(complementRed < 0) { complementRed = 0; }
		
		if(complementGreen > 255) { complementGreen = 255; }
		else if(complementGreen < 0) { complementGreen = 0; }
		
		if(complementBlue > 255) { complementBlue = 255; }
		else if(complementBlue < 0) { complementBlue = 0; }
		
		RGBColor complement = new RGBColor(complementRed, complementGreen, complementBlue);
		return complement;
	}

	public RGBColor darker(double percentage) {
		int redPercentage = (int) (this.red * percentage);
		int greenPercentage = (int) (this.green * percentage);
		int bluePercentage = (int) (this.blue * percentage);
		long darkerRed = (long) (this.red - redPercentage);
		long darkerGreen = (long) (this.green - greenPercentage);
		long darkerBlue = (long) (this.blue - bluePercentage);
		RGBColor darker = new RGBColor(darkerRed, darkerGreen, darkerBlue);
		return darker;
	}
}