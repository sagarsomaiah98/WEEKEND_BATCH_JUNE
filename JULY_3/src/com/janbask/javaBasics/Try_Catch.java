package com.janbask.javaBasics;

public class Try_Catch {
	
	public static void main(String[] args) {
		
		String[] students= new String[4]; 
		
		students[0]="john";
		students[1]="dean";
		students[2]="mark";
		students[3]="robin";
		
		//array length is equal array size-1
		try {
		System.out.println(students[4]);
		}
		catch(Exception e) {
			System.out.println("student not found");
			
			
		}
		
		System.out.println("end of the values");
		
	}

}
