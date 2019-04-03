package classes;
import java.awt.Point;
import java.awt.Rectangle;


public class PointRectangle {
	
	private Point upperLeft;
	private Point lowerRight;
	
	public PointRectangle(Point upperLeft, Point lowerRight) {
		super();
		this.upperLeft = upperLeft;
		this.lowerRight = lowerRight;
	}
	
	public PointRectangle(Rectangle r) {
		this.upperLeft = new Point(r.x, r.y);
		this.lowerRight = new Point(r.x + r.width, r.y + r.height);
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public Point getLowerRight() {
		return lowerRight;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public void setLowerRight(Point lowerRight) {
		this.lowerRight = lowerRight;
	}

	public void translate(int deltax, int deltay) {
		this.upperLeft.x += deltax;
		this.upperLeft.y += deltay;
		this.lowerRight.x += deltax;
		this.lowerRight.y += deltay;
	}

	public double perimeter() {
		return (2 * (this.lowerRight.x - this.upperLeft.x)) + (2 * (this.lowerRight.y - this.upperLeft.y));
	}

	public double area() {
		return (this.lowerRight.x - this.upperLeft.x) * (this.lowerRight.y - this.upperLeft.y);
	}

	public PointRectangle halfByWidth() {
		Point result = new Point((this.lowerRight.x + this.upperLeft.x)/ 2, this.lowerRight.y);
		PointRectangle resultRectangle = new PointRectangle(this.upperLeft, result);
		return resultRectangle;
	}
}