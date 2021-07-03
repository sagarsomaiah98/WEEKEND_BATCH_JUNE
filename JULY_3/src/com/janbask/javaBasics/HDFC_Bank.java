package com.janbask.javaBasics;

public class HDFC_Bank implements Reserve{
	
	
	

	public static void main(String[] args) {
		HDFC_Bank h= new HDFC_Bank ();
		h.savings_interest();
		h.credit_limit();

	}

	@Override
	public void savings_interest() {
		System.out.println("hdfc bank savings account balance is zero");
		
	}

	@Override
	public void credit_limit() {
	System.out.println("hdfc credit limit is 10000$");
		
	}

	@Override
	public void mobile_banking() {
		System.out.println("mobile banking HDFC");
		
	}

}
