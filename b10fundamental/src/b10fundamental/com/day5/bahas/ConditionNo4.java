package b10fundamental.com.day5.bahas;

import java.util.Scanner;

public class ConditionNo4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input;
		String nama = "";
		
		System.out.println("Welcome to Kodehive");
		
		do {
			
			System.out.println("1. Masukkan / Ubah nama kamu : ");
			System.out.println("2. Tampilkan nama kamu : ");
			System.out.println("3. Keluar dari program ");
			
			System.out.print("Silahkan masukkan pilihan : ");
			input = sc.nextLine();
			
			System.out.println();
			
		switch (input) {
			case "1":
				System.out.print("Masukkan nama kamu : ");
				nama = sc.nextLine();
				break;
			case "2":
				System.out.println("Nama kamu adalah : "+nama);
				break;
			case "3":
				System.out.println("TERIMA KASIH");
				break;
			}
			
//			if (input.equals("1")) {
//				
//				System.out.print("Masukkan nama kamu : ");
//				nama = sc.nextLine();
//				
//			} else if (input.equals("2")) {
//				System.out.println("Nama kamu adalah : "+nama);
//			} 			
//			
//			if (input.equals("3")) {
//				System.out.println("TERIMA KASIH");
//			}
			
		} while (!input.equals("3"));

	}

}
