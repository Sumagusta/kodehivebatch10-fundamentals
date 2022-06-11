package b10fundamental.com.day2.loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		// while digunakan untuk melakukan perulangan yang bersifat dinamis / tidak
		// pasti
		// kapan iterasinya akan berhenti

		int i = 5;
		int iterasi = 8; // tumbal variable
		while (i < 5) {
			System.out.println("Putaran sebanyak : " + iterasi + " index ke : " + i);
			iterasi += 8;
			i++; // increment
		}

		// command (//) -> untuk command per line dan bisa di hapus jika diulangi dengan
		// cara yang sama

		// command (/*...*/) -> untuk command beberapa line sekaligus, lebih bisa
		// menampung banyak kalimat namun tidak bisa dihapus dengan diulangi pakai cara
		// yang sama

		// auto arrage code (CTRL+SHIFT+F)

		System.out.println("-------------------------------------");

		int i2 = 5;
		int iterasi2 = 3;
		while (i2 > 0) {
			System.out.println("Putaran sebanyak : " + iterasi2 + " index ke : " + i2);
			iterasi2 += 50;
			i2--; // Decrement
		}

		Scanner scan = new Scanner(System.in);

//		while (scan.hasNext()) {
//			System.out.print("nama : "+scan.next());
//		}

	}

}
