package string_functions;

public class Trim {

	public static void main(String[] args) {
		 String str1 = "     Learn   Java Programming ";
		    String str2 = "Learn\nJava Programming\n\n   ";

		   // System.out.println(str1.trim());
		 
		    
		    //remove white space
		    
		    String str3 = "Learn\nJava \n\n   ";
		    String result;

		    // replace all whitespace characters with empty string
		            //in str3 replaceAll (replace space with nothing        
		    result = str3.replaceAll("\\s", "?");
		   System.out.println(result);  // LearnJava
		   result = str3.replaceAll("Learn", "Learning");
		   System.out.println(result);  

	}

}
