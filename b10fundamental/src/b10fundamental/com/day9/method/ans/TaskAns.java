package b10fundamental.com.day9.method.ans;

import java.util.ArrayList;
import java.util.List;

public class TaskAns {
	
	public static List<Integer> deret (int a, int b, int c) {
		List<Integer> gas = new ArrayList<Integer>();
		gas.add(a);
		gas.add(b);
		gas.add(c);
		return gas;
	}
	
	public static void main(String[] args) {
		
		var data = deret(2, 3, 2);
		
		for (int item : data) {
			item*=item;
			System.out.println(item);
		}
		
		
	}

}
