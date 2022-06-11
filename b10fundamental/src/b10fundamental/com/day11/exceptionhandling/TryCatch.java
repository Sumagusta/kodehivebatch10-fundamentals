package b10fundamental.com.day11.exceptionhandling;

import java.util.Iterator;

public class TryCatch {

	public static void main(String[] args) {

		int[] angka = { 1, 3 };
		try {
			angka[2] = 9;
			int data = 5 / 0;
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error " + e.getMessage() + ", perhatikan jumlah index array yang tersedia saat ini");
		} catch (ArithmeticException e) {
			System.out.println("Error " + e.getMessage() + ", value variabel tidak boleh dibagi NOL");
		} finally {
			System.out.println("catch error array & arithmetic");
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("My Loop " + i);
		}
	}

}
