
public class Students_array {

	public static void main(String[] args) {
		
		
		//Arrays = use to store similar object when you known size in advance
	
		/*
		 * String name1="Mark"; String name2="steve"; String name3="bob"; String
		 * name4="randy"; String name5="Adina"; System.out.println(name1);
		 * System.out.println(name2); System.out.println(name3);
		 * System.out.println(name4); System.out.println(name5);
		 */
		
		//datatype[]  arrayname = new datatype[size]
		
	    String[] student= new String[5];  
	    student[0]="Mark";
	    student[1]="steve";
	    student[2]="bob";
	    student[3]="randy";
	    student[4]="adina";
	    
	    
		/*
		 * System.out.println(student[0]); System.out.println(student[1]);
		 * System.out.println(student[2]); System.out.println(student[3]);
		 * System.out.println(student[4]);
		 */
	    for(int i=0;i<5;i++) {
	    	
	    	System.out.println(student[i]);
	    }
	    
		
		

	}

}
