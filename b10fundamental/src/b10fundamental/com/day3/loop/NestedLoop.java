package b10fundamental.com.day3.loop;

public class NestedLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("loop baris");
			for (int j = 0; j < 3; j++) {
				System.out.println("loop kolom dari baris ke " + i);
			}
		}

	}

}
