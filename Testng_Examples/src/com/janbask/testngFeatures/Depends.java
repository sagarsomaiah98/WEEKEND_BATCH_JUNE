package com.janbask.testngFeatures;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Depends {
	
	@Test(dependsOnMethods="test2")
	public void test1() {
		
		System.out.println("test1");
	}
	@Test
	public void test2() {
		
		System.out.println("test2");
		
		int r=0/0;
	}

}
