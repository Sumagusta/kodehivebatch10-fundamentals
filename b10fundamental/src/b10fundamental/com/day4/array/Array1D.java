package b10fundamental.com.day4.array;

public class Array1D {

	public static void main(String[] args) {

		String[] tokoBuah = {"Apel", "Klengkeng", "Jeruk", "Manggis", "Semangka", "Lemon", "Anggur", "Salak"};
		
		String keranjang = tokoBuah[1];
		
		System.out.println("PROMO BUAH MERAKYAT");
		for (int i = 0; i < tokoBuah.length; i++) {
			if (i == tokoBuah.length-1) {
				System.out.println(tokoBuah[i]+" ");
			} else {
				System.out.print(tokoBuah[i]+", ");

			}
		}
		
		//System.out.println(keranjang);
		
	}

}
