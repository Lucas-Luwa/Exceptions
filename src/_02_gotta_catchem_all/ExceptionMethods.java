package _02_gotta_catchem_all;

import java.util.Stack;

public class ExceptionMethods {
	public String reverseString(String a) throws IllegalArgumentException {
		if (a.equals("")) {
			throw new IllegalArgumentException();
		}
		String reverse = "";
		Stack<Character> character = new Stack<Character>();
		for (int i = 0; i < a.length(); i++) {

			character.add(a.charAt(i));

		}
		for (int i = 0; i < a.length(); i++) {

			reverse += character.pop();
		}
		return reverse;
	}

}
