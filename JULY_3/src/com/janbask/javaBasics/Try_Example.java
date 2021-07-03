package com.janbask.javaBasics;

public class Try_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int res=10/0;
		System.out.println(res);
		}
		
		catch(Exception r){
			r.printStackTrace();
		System.out.println("closing the program");
		

	}

	}
}
