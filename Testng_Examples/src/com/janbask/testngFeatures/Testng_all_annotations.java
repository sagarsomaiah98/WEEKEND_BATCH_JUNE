package com.janbask.testngFeatures;






	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.AfterTest;

	public class Testng_all_annotations {
	  @Test
	  public void method1() {
		  System.out.println("check mail in method1");
	  }
	  @Test
	  public void method2() {
		  System.out.println("check drafts in method2");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("before method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("after method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("after test");
	  }

	}

