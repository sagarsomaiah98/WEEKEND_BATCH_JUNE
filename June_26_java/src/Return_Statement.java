
public class Return_Statement {
	
	//access modifer- public
	//void = no return type
	
	public String add() {
		
		String name="welcome";
		
		return name;
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		Return_Statement ret= new Return_Statement();
		
		System.out.println( ret.add() );
		
	}

}
