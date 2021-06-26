
public class Multi_if_else {

	public static void main(String[] args) {
	
		
		int a=25;
		int b=40;
		int c=15;
		
		/*
		 *  & - and operator
		 * if(a>b&a>c)// false & true System.out.println("a is greater"); else
		 * System.out.println(" b or c is greater");
		 */

	
	//OR operator = ||
	if(a>b||a>c)// false or true
		System.out.println("a is greater");
	else
		System.out.println(" b or c is greater");

}

}
