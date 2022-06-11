package b10fundamental.com.day7.oop.method;

public class Calculator {
	
	// method penambahan
	public void logicPenambahan() {
		int a = 5, b = 2;
		int result = a + b;
		System.out.println(result);
	}

	protected void logicPengurangan() {
		int a = 5, b = 2;
		int result = a - b;
		System.out.println(result);
	}
	
	private void rahasia() {

		System.out.println("private hanya bisa digunakan didalam class yang mendeklarasikannya");
	}
	
	public static void main(String[] args) {
		
		Calculator objCalculator = new Calculator();
		objCalculator.rahasia();
		objCalculator.logicPengurangan();
		
		
		
	}

}
