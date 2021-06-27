
public class Calculator_methods {
	String name="calculator";
	
	public void addition() {
		
		
		int a=50;
		int b=20;
		System.out.println(a+b);
	}
	
	public void subtraction() {
		
		
		int a=30;
		int b=20;
		System.out.println(a-b);
	}
	
    public void multiplication() {
		
		
		int a=30;
		int b=20;
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Calculator_methods cal= new Calculator_methods();
		cal.addition();
		cal.addition();
		cal.addition();
		cal.addition();
		cal.addition();
		cal.addition();
		// call the method
	//cal.subtraction();
	//	cal.multiplication();

	}

}
