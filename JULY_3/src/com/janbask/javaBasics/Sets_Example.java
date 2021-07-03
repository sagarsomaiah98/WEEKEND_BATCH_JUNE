package com.janbask.javaBasics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> students = new HashSet<String>();
		students.add("mark");//0
		students.add("john");//1
		students.add("ken");//2
		students.add("dean");//3
		students.add("henry");//4
		students.add("steve");//5
		students.add("tam");
		
		int len= students.size();
				
				System.out.println("length of the student arraylist is = "+len);
		
		Iterator<String> it= students.iterator(); //create pointer to set object
		/*
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * 
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 * System.out.println(it.next()); System.out.println(it.hasNext());
		 */
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
