package b10fundamental.com.day8.constructor;

public class KelasConstructor {
	
	int angka;
	String text;
	
	public KelasConstructor(int a) {
		
		angka = 199;
		text = "Integer";
		
		System.out.println("Panggil variable global dari constructor  : "+ angka +" "+ text);
		System.out.println("Saya adalah Constructor, dengan parameter inputan : " + a);
	}
	
	public void bukanConstructor() {
		System.out.println("Method biasa");
	}

	public static void main(String[] args) {

		

	}

}
