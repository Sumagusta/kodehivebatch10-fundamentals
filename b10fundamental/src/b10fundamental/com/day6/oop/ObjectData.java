package b10fundamental.com.day6.oop;

import java.util.ArrayList;

public class ObjectData {
	
	String g = "hai";
	
	public static void main(String[] args) {
		
		ArrayList<String> data = new ArrayList<String>();
		data.add("panggil");
		
		ArrayList<String> data2 = new ArrayList<String>();
		
		data2.add(data.get(0));
		System.out.println(data2.get(0));
		
	}

}
