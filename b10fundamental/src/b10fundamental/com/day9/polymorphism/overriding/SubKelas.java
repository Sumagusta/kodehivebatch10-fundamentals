package b10fundamental.com.day9.polymorphism.overriding;

public class SubKelas extends SuperKelas {

	public int pengurangan(int a, int b) {
		int result = a - b;	
		result *= a;
		return result;
	}
	
	public void data() {
		super.pengurangan(3, 1);
	}
	
	public static void kurangkali(int ab, int bc) {
		SuperKelas a = new SubKelas();
		int kali = a.pengurangan(ab, bc);
		System.out.println(kali);
	}
	
	public static void main(String[] args) {

		SuperKelas d = new SubKelas();
		
		kurangkali(3, 4);
	}

}
