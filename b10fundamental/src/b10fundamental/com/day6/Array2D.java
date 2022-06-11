package b10fundamental.com.day6;

public class Array2D {

	public static void main(String[] args) {
		
		String[][] dataArray2D = new String[3][2];
		
		dataArray2D[0][0] = "Baris 0, Kolom 0";
		dataArray2D[0][1] = "Baris 0, Kolom 1";
		
		dataArray2D[1][0] = "Baris 1, Kolom 0";
		dataArray2D[1][1] = "Baris 1, Kolom 1";
		
		dataArray2D[2][0] = "Baris 2, Kolom 0";
		dataArray2D[2][1] = "Baris 2, Kolom 1";
		

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(dataArray2D[i][j]);		
			}
		}
		
	}

}
