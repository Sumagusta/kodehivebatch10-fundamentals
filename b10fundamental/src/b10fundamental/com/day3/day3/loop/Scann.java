package b10fundamental.com.day3.day3.loop;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nama : ");		
		String nama = scan.nextLine();
		
		System.out.print("Instructor : ");
		String instructor = scan.nextLine();
		
		System.out.print("Batch : ");
		int batch = scan.nextInt();
		
		System.out.println("BIO Bootcamp Member");
		System.out.println("Nama : "+nama);
		System.out.println("Instructor : "+instructor);
		System.out.println("Batch : "+batch);
		
		

	}

}
