package Data;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Xls_Reader xls= new Xls_Reader("D:\\JANBASK\\WEEKEND_WORKSPACE_BATCH1\\DATA_PARAMETRIZATION\\src\\main\\java\\TestData\\TESTSUITE.xlsx");
		int total_Rows=xls.getRowCount("GMAIL");
		
		
		  System.out.println(total_Rows);
		  
		  System.out.println(xls.getCellData("GMAIL", 2, 1));
		  
		 // xls.addColumn("GMAIL", "NewComment");
		  
			
			/*
			 * System.out.println(xls.getCellData("GMAIL", 1, 1));
			 * System.out.println(xls.getCellData("GMAIL", 2, 1));
			 * System.out.println(xls.getCellData("GMAIL", 3, 1));
			 * System.out.println("****************************");
			 * 
			 * System.out.println(xls.getCellData("GMAIL", 1, 2));
			 * System.out.println(xls.getCellData("GMAIL", 2, 2));
			 * System.out.println(xls.getCellData("GMAIL", 3, 2));
			 */
			 
		
	 // System.out.println( xls.getCellData("GMAIL", "TCID", 3));
	//  System.out.println( xls.getCellData("GMAIL", "TESTCASE", 3));
	//  System.out.println( xls.getCellData("GMAIL", "STATUS", 3));
	   
	//   xls.addColumn("GMAIL", "comments");
	  
	
	
	  for(int k=1;k<=total_Rows;k++) {
	  
	  System.out.print( xls.getCellData("GMAIL", "TCID", k)+" | "); 
	  System.out.print(xls.getCellData("GMAIL", "TESTCASE", k)+" | "); 
	  System.out.print(xls.getCellData("GMAIL", "STATUS", k)+" | "); 
	  System.out.println();
	  
	  }
	 
	  
	  
	

	}

}
