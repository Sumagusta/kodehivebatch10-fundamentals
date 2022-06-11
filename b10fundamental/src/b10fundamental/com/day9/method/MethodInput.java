package b10fundamental.com.day9.method;

import java.util.Scanner;

public class MethodInput {
	
	//Calculator
		
	//method non-input
	public static void tambah() {
		int a = 4;
		int b = 5;
		int result = a + b;
		System.out.println(result);
	}

	// method with input
	public static void tambah(int a, int b) {
		int result = a + b;
		System.out.println(result);
	}
	
	public static int pengurangan(int a, int b) {		
		int result = a - b;		
		return result;
	}
	
	public static void logicPenambahan(int a, int b, String c) {
		
		int result = a + b;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
		// hasil 1
		tambah(10, 5);
		tambah(20, 5);
		tambah(20, 10);

		logicPenambahan(0, 0, null);
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(pengurangan(a, b)*3);
		System.out.println("------------------------");
		
		tambah();
		tambah();
		tambah();
		
		tambah(10, 90);
		tambah(6, 3);
	}

}
