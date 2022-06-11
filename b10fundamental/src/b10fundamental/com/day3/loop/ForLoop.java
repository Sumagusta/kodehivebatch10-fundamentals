package b10fundamental.com.day3.loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String done = "cukup";
		
		int u = 10000;
		
		System.out.println("Jumlah uang: " + u);
		System.out.println("Jumlah \"cukup\" untuk berhenti, ketik apapun untuk lanjut");
		
		while (sn.hasNext()) {
			u*=2;
			System.out.println("Jumlah uang: " + u);
			System.out.println("Jumlah \"cukup\" untuk berhenti, ketik apapun untuk lanjut");
			
			String inp = sn.nextLine();
			
			
			if (inp.equals(done)) { 
				System.out.println("Program penggandaan selesai.");
				sn.close();
				break;
			}
		
		}

	}
}
