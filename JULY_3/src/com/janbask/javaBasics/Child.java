package com.janbask.javaBasics;

public class Child extends Parent {
	
	public void method_3() {
		System.out.println("method 3");
		
	}
	
	public void method_4() {
		
		System.out.println("method 4");
	}

	public static void main(String[] args) {
		
		Child c= new Child();
		c.method_3();
		c.method_4();
		c.method1();
		c.method2();
		c.Z();
		System.out.println(c.age);
		System.out.println(c.name);
		
		System.out.println("*****************");
		

	}

}
