package b10fundamental.com.day8;

public class StaticDeclaration {
	
	// static merupakah type method dimana semua method yang menggunakan static dalam 
	// satu class yang sama akan disimpan dalam satu memory yang sama
	
	int varStatic = 900;
	
	public void panggilStatic() {
		StaticDeclaration st = new StaticDeclaration();
		st.varStatic = 900;
	}

	static class Main{
		
		public static void main(String[] args) {
			StaticDeclaration st = new StaticDeclaration();
			
			StaticDeclaration st2 = new StaticDeclaration();
			
			st.varStatic = 700;
			
			st2.varStatic = 300;
			
			System.out.println("static st = "+st.varStatic+"\n static st2 = "+st2.varStatic);
		}
	}

}
