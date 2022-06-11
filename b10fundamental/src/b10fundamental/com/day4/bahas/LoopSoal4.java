package b10fundamental.com.day4.bahas;

import java.util.Random;
import java.util.Scanner;

public class LoopSoal4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("===============================");

		System.out.println("Program Pengganda Uang");

		System.out.println("===============================");

		int uang = 10000;

		String input = null;

		do {
				
			System.out.println("Jumlah Uang Anda Sekarang: " + uang);

			System.out.println("Ketik \"cukup\" untuk berhenti, ketik apapun untuk menggandakan lagi");

			System.out.println();

			input = in.nextLine();

			uang *= 2;

		} while(!input.toLowerCase().equals("cukup"));

		System.out.println("Program penggandaan selesai..");

	}

}
