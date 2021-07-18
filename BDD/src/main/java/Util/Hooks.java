package Util;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void before() {
		
		System.out.println("before scenario ");
	}

	@After
	public void after() {
		
		System.out.println("after");
	}
}
