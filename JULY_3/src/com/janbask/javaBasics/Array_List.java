package com.janbask.javaBasics;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String[] students= new String[10];
	//	students[15]="john";
		
		List<String> students= new ArrayList();
		students.add("mark");//0
		students.add("john");//1
		students.add("ken");//2
		students.add("dean");//3
		students.add("henry");//4
		students.add("steve");//5
		students.add("henry");//6
		students.add("oliver");
		students.add("ken");
		
		int len= students.size();
				
				System.out.println("length of the student arraylist is = "+len);
				
				
				for( int i=0;i<len;i++) {
				System.out.println(students.get(i));
		

	}
	}
}
