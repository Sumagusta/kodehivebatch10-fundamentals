package b10fundamental.com.day9.method;

public class MethodClass {
	
	// method non output / procedure
	public static void methodNonOutput() {
		int result = 90 + 9;
		System.out.println(result);
	}
	
	// method output
	public static String methodOutput() {
		
		String value = "Value method output";
		int a = 1;

		if(a != 1)
			return value;
		else
			return "value 2";
	}
	
	public static int outputAngka() {
		int result = 90 + 9;
		return result;
	}

	public static void main(String[] args) {
		int a = outputAngka() - 2;
		
		var data = methodOutput();
		System.out.println(methodOutput());
		
		System.out.println(outputAngka() * 8);
		
		methodNonOutput();
		
		methodOutput();
		
		String ab = methodOutput();
		
		//  * 2;

	}

}
