package b10fundamental.com.day10.polymorphism.overriding;

public class SubClass extends SuperClass{
	// 2
	
	@Override // digunakan utk memastikan bahwa nama method sama dengan method di super / @ = annotation
	public void buah() {
		System.out.println("Pisang");
		System.out.println("Apel");
		System.out.println("Nanas");
		super.buah();
	}	
	
	public void name() {
		super.buah();
	}
	
	public static void main(String[] args) {
		SuperClass scs = new SubClass();
		scs.buah();
		SubClass ss = new SubClass();
		ss.name();
		
	}
	
}
