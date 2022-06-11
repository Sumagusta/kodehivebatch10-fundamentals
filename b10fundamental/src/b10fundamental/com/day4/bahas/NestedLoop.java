package b10fundamental.com.day4.bahas;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("apel ");
				for (int j2 = 0; j2 < 2; j2++) {
					System.out.print("jeruk ");
				}
			}
			
			System.out.println();
		}
	}

}
