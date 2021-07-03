package com.janbask.javaBasics;

public class B extends A {
	
	
public void method_3() {
		
		System.out.println("class B - method 3");
		
	}
	
public void method_4() {
		
		System.out.println("Class B -method 4");
		
	}
//overriding the parent method
public void method_1() {
	
	System.out.println("class B - method 1");
	
}

public void method_2() {
	
	System.out.println("Class B - method 2");
	
}

	public static void main(String[] args) {
		
		B b= new B();
		b.method_3(); //child class method
		b.method_4(); //child class method
		b.method_1();
		b.method_2();
		System.out.println("**********************8");
		
		A a = new A();
		a.method_1();
		a.method_2();
		

	}

}
