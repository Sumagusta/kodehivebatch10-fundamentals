package b10fundamental.com.day4.bahas;

public class LoopNo2 {
	
	public static void printDeretMenurun(int jumlahBaris, int jumlahKolom) {
		
		int maxValue = jumlahBaris * jumlahKolom;
		
		for (int i = 0; i < jumlahBaris; i++) {
			for (int j = 0; j < jumlahKolom; j++) {
				System.out.printf("%3s", maxValue);
				maxValue = maxValue - 1;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

//		12 11 10
//		9 8 7
//		6 5 4
//		3 2 1

		printDeretMenurun(4, 6);
		
	}

}
