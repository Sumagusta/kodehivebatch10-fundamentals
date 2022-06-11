package b10fundamental.com.day6;

import java.util.ArrayList;
import java.util.List;

public class ListImp {

	public static void main(String[] args) {

		List<Double> data = new ArrayList<>();

		Double dt = 0.1;

		for (int i = 0; i < 5; i++) {
			data.add(dt);
			dt += dt;
		}
		
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}
		
	}

}
