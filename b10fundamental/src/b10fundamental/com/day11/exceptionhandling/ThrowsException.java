package b10fundamental.com.day11.exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsException {
	
	private static void declare1(int a) throws IOException {
		
		int result = a/0;
		System.out.println(result);
	}
	
	public static void main(String[] args) throws IOException {
		declare1(9);
	}
}
