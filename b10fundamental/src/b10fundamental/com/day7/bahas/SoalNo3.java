package b10fundamental.com.day7.bahas;

import java.util.Iterator;

public class SoalNo3 {

	public static void main(String[] args) {
		
		// 2 4 4 4 6 6 6 6 6
		int ukuranDeret = 16;
		int ganjil = 1;
		int genap = 2;
		
		int[] deretBilangan = new int[ukuranDeret]; // utk menympan deret ganjil bernilai genap
		int[] deretGanjil = new int[ukuranDeret];
		int[] deretGenap = new int[ukuranDeret];
		
		int idxBil = 0;
		int deret = 0;
		
		for (int i = 0; i < deretGenap.length; i++) {
			deretGanjil[i] = ganjil;
			ganjil+=2;
			
			deretGenap[i] = genap;
			genap+=2;
			
			if (idxBil < ukuranDeret) {
				for (int j = 0; j < deretGanjil[i]; j++) {
					deret = deretGenap[i];
					deretBilangan[idxBil] = deret;
					idxBil+=1;
				}
			}
		}
		
		for (int j = 0; j < deretBilangan.length; j++) {
			System.out.printf("%3s",deretBilangan[j]);
		}
		
	}

}
