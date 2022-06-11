package b10fundamental.com.day10.abstractclass;

public class AnakPertama extends OrangTua {

	
	@Override
	public void bakat() {
		// TODO Auto-generated method stub
		System.out.println("Basket");
	}
	
	public static void main(String[] args) {
		AnakPertama ap = new AnakPertama();
		ap.bakat();
		ap.harta();
	}
	
}
