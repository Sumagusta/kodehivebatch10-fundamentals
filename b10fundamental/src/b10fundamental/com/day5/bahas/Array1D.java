package b10fundamental.com.day5.bahas;

public class Array1D {

	public static void main(String[] args) {
								// 0	// 	1		//2			//3			//4
		String[] tokoBuah = { "Apel", "Klengkeng", "Jeruk", "Manggis", "Semangka" };


		int[] daftarHarga = {2500, 500, 2500, 1500, 35000};
		
		String keranjang = tokoBuah[1];

		System.out.println("PROMO BUAH MURAH");
		
		for (int i = 0; i < tokoBuah.length; i++) {
			if (i == tokoBuah.length - 1) {
				System.out.println(tokoBuah[i] + " = "+ daftarHarga[i]+"");
			} else {
				System.out.print(tokoBuah[i]  + " = "+ daftarHarga[i] + ", ");
			}
		}
		
		System.out.print("Total Harga : ");
		int totalHarga = 0;
		
		for (int i = 0; i < daftarHarga.length; i++) {
			
			totalHarga += daftarHarga[i];
			
		}
		
		System.out.println(totalHarga);

	}

}
