package b10fundamental.com.day3.condition;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan Nama Bulan : ");
		String bulan = scan.nextLine();
		
		switch (bulan.toLowerCase()) {
		case "januari":
			System.out.println("Bulan ke 1");
			break;
		case "february":
			System.out.println("Bulan ke 2");
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
