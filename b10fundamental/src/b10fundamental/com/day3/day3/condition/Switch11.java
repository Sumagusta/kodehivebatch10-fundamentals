package b10fundamental.com.day3.day3.condition;

import java.util.Scanner;

public class Switch11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Angka Bulan : ");
		int bulan = scan.nextInt();
		
		switch (bulan) {
		case 1:
			System.out.println("Januari");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("Maret");
			break;

		default:
			System.out.println("Bukan bulan Januari dan February");
			break;
		}
		
		/* Note : 
		 * 
		 * Switch case akan langsung menuju pada case yang sama dengan kondisi, tanpa cek case case lainnya
		 * Switch case kekurangannya tidak bisa menggunakan operator pada kondisinya
		 * Switch case adalah kondisi yang paling ringan
		 * */

	}

}
