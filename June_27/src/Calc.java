
public class Calc {
	
	

	
	public int add(int a, int b) {
		
		
		
		int res=a+b; //20+30 50             14+6  20
		 res= res*10; //50*10  500          20*10  200
		  res= res-10;//500-10 490        200-10   190
		  
		  res=res+20; // 490+20 510        190+20   210
		  // 510                210
		
		return res+10-6;
	}
	

	public static void main(String[] args) {
		
		
		Calc c = new Calc();
		int value;
		
		value=c.add(20, 30);
	//	System.out.println(value);
		
		
		
		  value= c.add(14, 6); 
		//  System.out.println(value);
		  
		  value= c.add(24, 16); 
		  System.out.println(value);
		 
		
		
	    
	
		

	}

}
