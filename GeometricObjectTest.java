package Generics;

import java.util.Scanner;

public class GeometricObjectTest {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter triangle's sides : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		Triangle triangle = new Triangle(a,b,c);
		System.out.println("Enter rectangle's sides : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		Rectangle rectangle = new Rectangle(a,b);
		System.out.println("Enter circle's radius : ");
		a=sc.nextDouble();
		Circle circle = new Circle(a);
		
		
		System.out.println("Triangle area = " + triangle.getArea());
		System.out.println("Rectangle area = " + rectangle.getArea());
		System.out.println("Circle area = " + circle.getArea());
		
	}

}
