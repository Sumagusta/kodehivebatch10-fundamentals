package b10fundamental.com.day7.bahas;

import java.util.ArrayList;

public class SoalNo5 {

	public static void main(String[] args) {

		int b = 2;
		int c = 1;
		String operator = "!";

		ArrayList<Double> a = new ArrayList<Double>();
		a.add(5.80);
		a.add(5.20);
		a.add(3.99);

		if (operator.equals("+") || operator.equals("-")) {
			
			if (operator.equals("-")) {
				
				double result = a.get(b) - a.get(c);
				System.out.println(a.get(b) + " + " + a.get(c) + " = " + result);
				
			} else if (operator.equals("+")) {

				double result = a.get(b) + a.get(c);
				System.out.println(a.get(b) + " + " + a.get(c) + " = " + result);
			}
		}else {
			System.out.println("Inputan harus (+) / (-)");
		}

	}

}
