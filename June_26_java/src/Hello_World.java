
public class Hello_World {
	int age=20;
	String name="john";
	
	public void method1() {
		System.out.println("hello world");
		
	}

	public static void main(String[] args) {
		
		//classname objectname= new classname();
		Hello_World apple= new Hello_World(); // create object 
		apple.method1();
	  int k= apple.age;
	  System.out.println(k);
	  System.out.println(apple.name);
		

	}

}
