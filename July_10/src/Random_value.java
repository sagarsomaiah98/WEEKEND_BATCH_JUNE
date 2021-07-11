import java.util.Random;

public class Random_value {
	
	
	public static  String uname() {
		
		int leftLimit = 97; // letter 'a'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 7;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    
	    return generatedString;
	   // System.out.println(generatedString);

		
	}

	public static void main(String[] args) {
		
		String name= uname();
		System.out.println(name);
		
		
		
	}

}
