package b10fundamental.com.day6;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {

		ArrayList<Integer> data = new ArrayList<>();
		
		data.add(100);
		data.add(1000);
		data.add(200);
		data.add(2000);
		data.add(300);
		
		System.out.println(data);
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println("index ke "+i+" "+data.get(i));
		}
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println("index ke "+i+" "+data.get(i));
		}
		
		System.out.println();
		ArrayList<String> dataString = new ArrayList<String>();
		dataString.add("Data huruf 1");
		dataString.add("Data huruf 2");
		dataString.add("Data huruf 3");		
		
		
		for (int i = 0; i < dataString.size(); i++) {
			System.out.println(dataString.get(i));
		}
		System.out.println();
		dataString.add("Data huruf 4");
		
		for (int i = 0; i < dataString.size(); i++) {
			System.out.println(dataString.get(i));
		}
		
		
		
		
	}

}
