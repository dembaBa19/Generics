package Generics;

public class Circle extends GeometricObject {
	private double radius = 1.0;
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getSide1() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
	public String print() {
		return "Circle : radius = " + radius + ", Area = " + this.getArea() + ", Perimeter = " + this.getPerimeter();
	}
}
