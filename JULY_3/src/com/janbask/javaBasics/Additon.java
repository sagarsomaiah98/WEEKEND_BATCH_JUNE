package com.janbask.javaBasics;

public class Additon {
	
	public void method1() {
		
		System.out.println("no argument");
	}

	
public void method1(int a) {
		
		System.out.println("argument");
	}

public void method1(String a) {
	
	System.out.println("Stringargument");
}

	public static void main(String[] args) {
		
		Additon ad = new Additon();
		ad.method1("john");
		
	}

}
