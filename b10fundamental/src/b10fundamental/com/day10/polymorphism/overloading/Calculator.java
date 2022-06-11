package b10fundamental.com.day10.polymorphism.overloading;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	// overloading
	
	/**
	 * ini adalah method tambah versi pertama
	 **/
	// tambah
	public static int tambah(int a, int b) {
		int result = a + b;
		return result;
	}
	
	//tambah v2
	/**
	 * ini adalah method tambah versi kedua
	 **/
	public static double tambah(int a, double b) {
		double result = a + b;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(tambah(3, 4));
		
	}
}
