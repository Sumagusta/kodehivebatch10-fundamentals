package b10fundamental.com.day11.exceptionhandling;

import java.util.Iterator;

public class ThrowException {
	
	public static void main(String[] args) {
	
		String fullName = "Jaki My";
		
		if (fullName.length() < 8) {
			throw new ArithmeticException("Nama kurang dari 8 karakter");
			//System.out.println("karakter Nama kurang dari 8 karakter");
		}
		
		for (int i = 0; i < fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
		
	}

}
