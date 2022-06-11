package b10fundamental.com.day7.bahas;

public class SoalNo1 {

	public static void main(String[] args) {

		//  1 x 3 x 5 x 7 x 9 x
		
		int n = 10;
		int sizeDeret = 1;
		for (int i = 0; i < n; i++) {
			System.out.printf("%3s",sizeDeret + " x ");
			sizeDeret+=2;
		}

	}

}
