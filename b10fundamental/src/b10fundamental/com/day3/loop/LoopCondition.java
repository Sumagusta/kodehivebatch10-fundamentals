package b10fundamental.com.day3.loop;

import java.util.Scanner;

public class LoopCondition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String done = "stop";
		
//		while (scan.hasNext()) {
//			String input = scan.nextLine();
//			
//			if (input.equals(done)) {
//				continue;
//			}	else {
//				System.out.println(input);
//			}
//		}
//		
//		System.out.println("Inputan berakhir");
		
		
		for (int i = 0; i < 10; i++) {
			
			if (i != 5) {
				System.out.println(i + " "
						+ "angka ini != 5");
			} else {
				continue;
			}
		}
		
		

	}

}
