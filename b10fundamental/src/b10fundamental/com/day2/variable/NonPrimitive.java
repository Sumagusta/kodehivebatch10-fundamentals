package b10fundamental.com.day2.variable;

import java.util.Iterator;

public class NonPrimitive {

	public static void main(String[] args) {

		// String
		String kalimat = "kumpulan karakter";
		System.out.println(kalimat);
		
		// string format table : https://www.javatpoint.com/java-string-format
		
		// string format
		String format1 = String.format("data : %5h", 12);
		System.out.println(format1);
		
		System.out.println();
		
		// printf
		for (int i = 0; i < 5; i++) {
			System.out.printf("%3s", i);
		}
		System.out.println("\n");
		
		// String buffer
		StringBuffer data  = new StringBuffer("Kodehive");
		data.append(" Academy");
		data.append(" Batch 10");
		
		data.insert(8, " and");
		
		System.out.println(data.indexOf("ve"));
		System.out.println(data);
		
		
		// Substring
		String subs = "Belajar Substring";
		System.out.println(subs.substring(8));
		System.out.println(subs.indexOf("b"));
		System.out.println(subs.substring(4, 10));
		
		
	}

}
