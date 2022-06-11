package b10fundamental.com.day11.exceptionhandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] angka = { 1, 3 };
		try {
			
			try {
				int data = 5 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Error " + e.getMessage() + ", value variabel tidak boleh dibagi NOL");
			}

			try {
				angka[2] = 9;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out
						.println("Error " + e.getMessage() + ", perhatikan jumlah index array yang tersedia saat ini");
			}

		} catch (Exception e) {
			System.out.println("Handled statement");
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("My Loop " + i);
		}

	}

}
