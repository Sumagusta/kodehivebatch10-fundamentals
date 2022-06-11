package b10fundamental.com.day9.method;

import java.util.ArrayList;
import java.util.List;

public class MethodTask {

	public static List<Integer> data(int a, int b, int c){
		
		List<Integer> save = new ArrayList<Integer>();
		save.add(a);
		save.add(b);
		save.add(c);
		
		return save; 
	}
	
	public static void main(String[] args) {

		// Buatlah suatu method yang memiliki > 3 inputan dan < 5 inputan (int)
		// kemudian jika method tersebut dipanggil, semua inputannya akan 
		// dikalikan oleh inputan itu sendiri
		// tampilkan semua hasil berdasarkan jumlah inputan
		
		// input : 1, 2, 3 ..
		// output : 1, 4, 9, ..
		
		var data = data(5, 5, 3);
		for (int item : data) {
			item*=item;
			System.out.println(item);
		}
		
		
	}

}
