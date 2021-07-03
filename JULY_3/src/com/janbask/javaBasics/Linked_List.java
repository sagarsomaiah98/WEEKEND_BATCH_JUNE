package com.janbask.javaBasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		List<String> students= new LinkedList();
		students.add("mark");//0
		students.add("john");//1
		students.add("ken");//2
		students.add("dean");//3
		students.add("henry");//4
		students.add("steve");//5
		students.add("james");//6
		students.add("oliver");
		students.add("ram");
		
		int len= students.size();
				
				System.out.println("length of the student arraylist is = "+len);
				
				
				for( int i=0;i<len;i++) {
				System.out.println(students.get(i));
		

	}
	}
}
