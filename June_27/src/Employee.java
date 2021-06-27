
public class Employee {
	
	
	public void name(String name) {
		
		System.out.println("Employee name is "+name);
		
		
	}
	
	public void age(int age) {
		System.out.println("Employee age is "+age);
		
		
	}

	public static void main(String[] args) {
		Employee emp = new Employee() ;
		emp.name("john");
		emp.age(55);
		emp.name("ken");
		emp.age(32);
		emp.name("steve");
		emp.age(49);
		emp.name("jake");
		emp.age(40);
			
			
		}

	}


