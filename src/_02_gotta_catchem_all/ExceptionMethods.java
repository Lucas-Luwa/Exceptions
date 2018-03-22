package _02_gotta_catchem_all;

import java.util.Stack;

public class ExceptionMethods {

	public double divide(double a, double b) throws IllegalArgumentException {
		
		if (b == 0.0) {
			throw new IllegalArgumentException();
		}
		double c = a / b;
		return c;
	}

	public String reverseString(String a) throws IllegalStateException {
		if (a.equals("")) {
			throw new IllegalStateException();
		}
		String reverse = "";
		Stack<Character> character = new Stack<Character>();
		int c = a.length();
		for (int i = 0; i <c; i++) {

			character.push(a.charAt(i));

		}
		for (int i = 0; i < c; i++) {
			System.out.println(reverse);
			reverse += character.pop();
		
			
		}
	
		return reverse;
	}

}
