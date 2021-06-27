
public class Global_Variable {
	
	int v=20;
	
	
	public void method1() {
		
		
		System.out.println("method1 "+v);
		
		
		
	}
public void method2() {
		
		
		System.out.println("method2 "+v);
		
		
		
	}
	
	

	public static void main(String[] args) {
		Global_Variable g = new Global_Variable();
		g.method1();
		g.method2();
		int a= g.v;
		
		System.out.println("a value is " +a);
		
		
	}

}
