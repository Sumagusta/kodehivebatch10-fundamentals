package b10fundamental.com.day5.bahas;

public class SimpleTaskDay5 {

	public static void main(String[] args) {

		/*
		 * 1. Terdapat suatu Toko yang menjual 4 jenis baju,
		 * "Jaket, Kaos, Jeans, Hoody".
		 * 
		 * Masing-masing mempunyai harga 100000, kecuali Hoody yang sedang mahal yakni,
		 * 250000
		 * 
		 * Suatu hari datanglah seorang pembeli utk membeli baju, dia diberikan batasan
		 * utk membeli baju maksimal 3 baju.
		 * 
		 * Berapa total harga baju yang dibeli oleh pembeli tersebut? jika baju yang
		 * tidak dibeli adalah Hoody.
		 * 
		 * Kerjakan dengan array.
		 * 
		 * 10 menit.
		 * 
		 */

		String[] jenisBaju = { "Jaket", "Kaos", "Jeans", "Hoodie" };
		int[] jumlahBeli = new int[3];
		int[] hargaBaju = { 100000, 100000, 100000, 250000 };

		int totalHarga = 0;

		for (int i = 0; i < hargaBaju.length; i++) {

			if (hargaBaju[i] != 250000) {

				jumlahBeli[i] = hargaBaju[i];

				System.out.println("Baju : " + jenisBaju[i] + ", Price: " + jumlahBeli[i]);

				totalHarga += jumlahBeli[i];

			} else {
				System.out.println("Batas pembelian hanya 3");

			}
		}

		System.out.println("Total yang harus dibayar" + " " + totalHarga);

	}

}
