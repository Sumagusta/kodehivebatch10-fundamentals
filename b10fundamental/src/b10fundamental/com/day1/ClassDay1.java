package b10fundamental.com.day1;

// object
public class ClassDay1 {
	
	// variable
	int usia = 25; // state
	
	public void lari() {
		System.out.println("Berlari Cepat dan Tangkas");		
		System.out.println("Mempunyai stamina yang kuat dalam berlari");		
	}
	
	// ctrl+f11 untuk running

	// method // behaviour
	public static void main(String[] args) {
		ClassDay1 a = new ClassDay1();
		System.out.println("usia : "+a.usia);
		a.lari();

	}

}
