package b10fundamental.com.day2.variable.scope;

public class LocalAndGlobal {
	
	// global
	int size = 50;

	public void method1() { // local
		int size = 10;
		int data = 1;
		
		int result = this.size;
	}
	
	public void method2() {
		int dataGlobal = size;
	}

}
