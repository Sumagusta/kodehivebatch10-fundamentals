package b10fundamental.com.day5.bahas;

public class ConditionNo2 {

	public static void main(String[] args) {

/*		Buatlah fungsi yang akan melakukan print out dengan kondisi berikut:
 * 
//			1. Jika nilai int Loop adalah genap maka tampilkan text sebagai "genap", 
				jika int Loop adalah ganjil maka text adalah "ganjil"
				
//			2. Jika nilai int Loop lebih dari 10 maka, tampilkan text dengan huruf besar, 
				jika kurang dari 10 maka tampilkan huruf kecil
				
//			3. Print tulisan sebanyak jumlah int Loop, dan setiap kelipatan 5 di dalam loop, 
				tambahkan tanda seru pada text.*/

		// if n = 10
//		genap
//		genap
//		genap
//		genap
//		genap!
//		genap
//		genap
//		genap
//		genap
//		genap!
		
		answer(50);
	}
	
	public static void answer(int loop) {
		//logic kamu
		
		String text = "";
		
		if (loop % 2 == 0) {			
			
			if (loop > 10) {
				text = "GENAP";
			} else {
				text = "genap";
			}
			
		} else {			
			
			if (loop > 10) {
				text = "GANJIL";
			} else {
				text = "ganjil";
			}
		}
		
		for (int i = 1; i <= loop; i++) {
			
			if (i % 5 == 0) {
				System.out.println(i+" "+text+"!");
			}else {
				System.out.println(i+" "+text);
			}
			
		}
		
		
	}

}
