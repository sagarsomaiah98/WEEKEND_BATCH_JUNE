package com.janbask.javaBasics;

public class XYZ_Bank implements Reserve {

	public static void main(String[] args) {
	
  XYZ_Bank x = new XYZ_Bank();
  x.savings_interest();
  x.credit_limit();
	}

	@Override
	public void savings_interest() {
		System.out.println("XYZ bank saving balance is 5000$");
		
	}

	@Override
	public void credit_limit() {
		System.out.println("xyz credit limit is 20000$");
		
	}

	@Override
	public void mobile_banking() {
		System.out.println("mobile banking for XYZ");
	}

}
