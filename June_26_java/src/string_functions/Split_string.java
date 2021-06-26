
package string_functions;
import java.util.Arrays;

public class Split_string {

	public static void main(String[] args) {
		   String vowels = "a::b::c::d:e";

		    // splitting the string at "::"
		    // storing the result in an array of strings
		    String[] res = vowels.split("::");

		    // converting array to string and printing it
		    System.out.println("result = " + Arrays.toString(res));
		    
		    
		    String[] resul = vowels.split("\\+");

		    // converting array to string and printing it
		    System.out.println("result = " + Arrays.toString(resul));
		    
		    
		    
		 // splitting array at ":"

		    // limit is -2; array contins all substrings
		    String[] result = vowels.split(":", -2);
		    System.out.println("result when limit is -2 = " + Arrays.toString(result));

		    // limit is 0; array contains all substrings
		    result = vowels.split(":", 0);
		    System.out.println("result when limit is 0 = " + Arrays.toString(result));

		    // limit is 2; array contains a maximum of 2 substrings
		    result = vowels.split(":", 2);
		    System.out.println("result when limit is 2 = " + Arrays.toString(result));

		    // limit is 4; array contains a maximum of 4 substrings
		    result = vowels.split(":", 4);
		    System.out.println("result when limit is 4 = " + Arrays.toString(result));

		    // limit is 10; array contains a maximum of 10 substrings
		    result = vowels.split(":", 10);
		    System.out.println("result when limit is 10 = " + Arrays.toString(result));
	}

}
