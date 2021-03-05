package Generics;

import java.util.Scanner;

public class TestGenericStack2 {
	public static void main(String[] args) {
		// Create a Scanner
		GenericStack2<String> stack1 = new GenericStack2<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 5 strings");
		for(int i=0; i<5; i++) {
			stack1.push(s.nextLine());
		}
		for(int i=0; i<5; i++) {
			System.out.println(stack1.pop());
		}
	}
	
//	stack1.push("Berlin");
}
