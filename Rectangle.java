package Generics;

public class Rectangle extends GeometricObject {
	private double side1;
	private double side2;

	public Rectangle() {
	}
	
	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	public Rectangle(double side1, double side2, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		setColor(color);
		setFilled(filled);
	}

	/** Return side1 */
	public double getside1() {
		return side1;
	}

	/** Set a new side1 */
	public void setside1(double side1) {
		this.side1 = side1;
	}

	/** Return side2 */
	public double getside2() {
		return side2;
	}

	/** Set a new side2 */
	public void setside2(double side2) {
		this.side2 = side2;
	}

	/** Return area */
	public double getArea() {
		return side1 * side2;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (side1 + side2);
	}
	
	public String toString() {
		// return super.toString() + "\nside1 is " + side1 + "\nside2" + side2;
		return "Area = " + getArea();
	}
}