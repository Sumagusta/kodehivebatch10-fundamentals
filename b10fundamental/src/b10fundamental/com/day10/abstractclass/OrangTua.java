package b10fundamental.com.day10.abstractclass;

import java.util.ArrayList;
import java.util.List;

public abstract class OrangTua {
	
	// concrete method
	public static void harta() {
		System.out.println("Emas");
		System.out.println("Tanah");
	}
	
	public void name() {
		List<String> data = new ArrayList<String>();
		data.add("test");
	}
	
	// abstract method
	public abstract void bakat();
	
}
