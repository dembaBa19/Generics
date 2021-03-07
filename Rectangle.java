package Generics;

public class Rectangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	
	public Rectangle() {
		
	}
	
	public Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	
	public double getPerimeter() {
		return (side1+side2)*2;
	}
	
	public double getArea() {
		return side1*side2;
	}
	
	public String print() {
		return "Circle : Length = " + side1 + ", Width = " + side2 + ", Area = " + this.getArea() + ", Perimeter = " + this.getPerimeter();
	}
}
