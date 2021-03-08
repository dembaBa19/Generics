package Generics;

import java.util.Scanner;

public class GeometricObjectTest {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter triangle's sides : ");
//		a=sc.nextDouble();
//		b=sc.nextDouble();
//		c=sc.nextDouble();
//		Triangle triangle = new Triangle(a,b,c);
		System.out.println("Enter rectangle's sides : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		Rectangle rectangle = new Rectangle(a,b);
		System.out.println("Enter circle's radius : ");
		a=sc.nextDouble();
		Circle circle = new Circle(a);
		
		int comp = rectangle.compareTo(circle);
		if(comp==-1) {
			System.out.println("Rectangle's area (" + rectangle.getArea() + ") is smaller than the Circle's area (" + circle.getArea() + ")");
		} else {
			if(comp==0) {
				System.out.println("Rectangle's area (" + rectangle.getArea() + ") is equal to the Circle's area (" + circle.getArea() + ")");
			} else {
				System.out.println("Rectangle's area (" + rectangle.getArea() + ") is bigger than the Circle's area (" + circle.getArea() + ")");
			}
		}
		
//		System.out.println("Triangle area = " + triangle.getArea());
		System.out.println("Rectangle area = " + rectangle.getArea());
		System.out.println("Circle area = " + circle.getArea());
		
	}

}
