package b10fundamental.com.day3.day3.condition;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nama = sc.nextLine(); 
		int usia = sc.nextInt();
		
		if (usia < 3 && nama.toLowerCase().equals("dina")) {
			System.out.println("PAUD");
		} else if (usia > 4 && usia <= 5) { // negasi && kondisinya akan true jika kedua kondisi benar
			System.out.println("TK");
		} else if (usia > 7 || usia < 7 ) {// negasi || kondisinya akan true jika salah satu kondisi benar
			System.out.println("SD");
		} else {
			System.out.println("Bukan Paud");
		}

	}

}
