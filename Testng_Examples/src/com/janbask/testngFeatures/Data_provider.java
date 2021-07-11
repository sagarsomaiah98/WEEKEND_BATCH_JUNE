package com.janbask.testngFeatures;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n+"-------"+s);
  }

  @DataProvider
  public Object[][] dp() {
	                          // rows cols(paramaters)   
	  Object[][] getdata= new Object[4][2];
	  getdata[0][0]="fname";
	  getdata[0][1]="lname";
	  
	  //second row
	  getdata[1][0]="aryan";
	  getdata[1][1]="singh";
	  
	  //third row
	  getdata[2][0]="aaa";
	  getdata[2][1]="bbb";
	  
	  //fourth row
	  getdata[3][0]="kane";
	  getdata[3][1]="pwd1";
	  return getdata;
  }
}
    /*return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}*/
