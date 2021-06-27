


public class Method_Overloading {
	
  // same method name but different arguments/parameters
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
	
	public void add(int a, int b,int c) {
		
		System.out.println(a+b+c);
	}
	
    public void add(int a, int b,int c, int d) {
		
		System.out.println(a+b+c+d);
	}
	
	
public static void main(String[] args) {
		
		Method_Overloading m = new Method_Overloading();
		m.add(2, 10, 30, 80);
		
		
	}
	

}
