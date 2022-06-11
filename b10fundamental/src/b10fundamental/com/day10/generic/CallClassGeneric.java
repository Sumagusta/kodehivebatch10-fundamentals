package b10fundamental.com.day10.generic;

import java.util.ArrayList;
import java.util.List;

import b10fundamental.com.day10.abstractclass.AnakPertama;

public class CallClassGeneric {

	public static void main(String[] args) {

		GenericClass<String> name = new GenericClass<String>("Dony");
		GenericClass<Integer> usia = new GenericClass<Integer>(26);
		
		System.out.println(name.getGeneric());
		System.out.println(usia.getGeneric());	
		
	}

}
