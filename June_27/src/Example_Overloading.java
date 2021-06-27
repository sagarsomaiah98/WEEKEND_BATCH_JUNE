
public class Example_Overloading {
	
	public void method1(String name) {
		
		System.out.println(" method 1 with name "+name);
		
	}
	
public void method1(String name, int number) {
		
		System.out.println(" method 1 with name "+name+" and "+number);
		
	}
public void method1(int number1, int number) {
	
	System.out.println(" method 1 with name "+number1+" and "+number);
	
}
	

	public static void main(String[] args) {
		
		Example_Overloading e = new Example_Overloading();
		e.method1("John");
		e.method1("ken", 58);
		e.method1(22, 19);

	}

}
