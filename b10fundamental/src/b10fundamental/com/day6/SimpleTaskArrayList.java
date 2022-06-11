package b10fundamental.com.day6;

import java.util.ArrayList;

public class SimpleTaskArrayList {

	public static void main(String[] args) {

		/*
		 * Suatu restoran sedang menerima banyak pesanan
		 * ada setidaknya 10 pembeli, 3 pembeli memesan ayam geprek, 4 pembeli memesan ayam bakar,
		 * 3 pembeli memesan sate taichan.
		 * 
		 * beberapa waktu kemudian 3 pembeli yang memesan paling akhir membatalkan pesanannya
		 * 
		 * 
		 * buat logicnya menggunakan arraylist yang menggambarkan studi kasus diatas
		 * 10 menit
		 * */
		
		ArrayList<String> pembeli = new ArrayList<String>();
		
		pembeli.add("ayam geprek");
		pembeli.add("ayam geprek");
		pembeli.add("ayam geprek");
		pembeli.add("ayam bakar");
		pembeli.add("ayam bakar");
		pembeli.add("ayam bakar");
		pembeli.add("ayam bakar");
		pembeli.add("sate taichan");
		pembeli.add("sate taichan");
		pembeli.add("sate taichan");
		
		int pesananBatal = 5;
		
		for (int i = 0; i < pesananBatal; i++) {
			
			pembeli.remove(pembeli.size()-1);
		}
		for (int i = 0; i < pembeli.size(); i++) {
			System.out.println(pembeli.get(i));
		}

	}

}
