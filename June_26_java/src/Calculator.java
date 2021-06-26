
public class Calculator {
	
	int value=200;
	String name="calculator123";
	
	public void add() {
		
		
		int a=20;
		int b=30;
		
		System.out.println("addition of a & b is "+ a+b);
	}
public void sub() {
		
		
		int k=20;
		int j=30;
		
		System.out.println("addition of k & j is "+ (k-j));
	}


	public static void main(String[] args) {
		
		//create a object
		//classname objectname = new Classname
		Calculator cal=new Calculator();
		cal.add();
		cal.sub();
		System.out.println(cal.name);
		System.out.println(cal.value);
		

	}

}
