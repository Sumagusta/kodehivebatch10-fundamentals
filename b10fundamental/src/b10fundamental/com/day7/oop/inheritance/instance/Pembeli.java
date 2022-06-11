package b10fundamental.com.day7.oop.inheritance.instance;

public class Pembeli {
	
	int usiaPembeli = 25;

	public static void main(String[] args) {
		
		Pembeli pm = new Pembeli();
		
		System.out.println(pm.usiaPembeli);
		
		// instance / pembuatan object dari suatu class
		Penjual penjual = new Penjual();
		String data = penjual.barang1();
		
		String namaDariPenjual = penjual.namaPenjual;
		System.out.println("Nama Penjual : "+namaDariPenjual);
		System.out.println("Nama Barang : "+data);
		penjual.barang2();
	}

}
