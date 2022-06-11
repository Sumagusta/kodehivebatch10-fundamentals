package b10fundamental.com.day8.inheritance;

import b10fundamental.com.day8.inheritance.implement.Kontrak;
import b10fundamental.com.day8.inheritance.otherpackage.OrangTua;

public class Anak extends OrangTua {

	public static void main(String[] args) {

		Anak an = new Anak();
		an.bakat();
		an.emas();
		an.rumah();
		int tampungVariableOrangTua = an.data;

		OrangTua or = new OrangTua();
		or.bakat();
		or.emas();

	}

}
