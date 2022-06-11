package b10fundamental.com.day8.inheritance.implement;

import java.util.List;

public class Karyawan implements Kontrak {

	@Override
	public void maintainWeb() {
		System.out.println("Terjadi bug di ..");		
	}

	@Override
	public void developNewWebApp() {
		System.out.println("Development berjalan 75%");
	}

	@Override
	public void tepatWaktu() {
		System.out.println("Telat 15 min");
	}

	@Override
	public void jobdeskLainnya() {
		// TODO Auto-generated method stub
		System.out.println("Design UI/UX");
	}

	@Override
	public List<String> cobaArrayAbs() {

		
		return null;
	}

	

}
