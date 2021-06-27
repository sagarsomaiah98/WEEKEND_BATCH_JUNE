
public class Overloading_constructor {
	
	//constructor overloading
	
	public Overloading_constructor() {
		
		System.out.println("default constructor");
	}
	
public Overloading_constructor(int i) {
		
		System.out.println("parameterized constructor "+i);
	}

public Overloading_constructor(String name) {
	
	System.out.println("parameterized constructor "+name);
}
	
	
	
	

	public static void main(String[] args) {
		Overloading_constructor oc= new Overloading_constructor("john");
		Overloading_constructor oc1= new Overloading_constructor(2);
		Overloading_constructor oc2= new Overloading_constructor();
		
		

}
}