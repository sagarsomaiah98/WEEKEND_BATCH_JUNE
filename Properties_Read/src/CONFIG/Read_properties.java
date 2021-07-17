package CONFIG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_properties {
	
	 static FileInputStream fis;
	 static Properties prop ;
	 
	 
	public static String browser() throws IOException {
		
     fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\CONFIG\\config.properties");
		
	   prop	= new Properties();
		prop.load(fis);
		
		String bname=prop.getProperty("browser");
		
		return bname;
		
		
		
		
		
	}
	
	
	public static String url() throws IOException {
		
	     fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\CONFIG\\config.properties");
			
		   prop	= new Properties();
			prop.load(fis);
			
			String bname=prop.getProperty("url");
			
			return bname;
			
			
			
			
			
		}
	

	
	public static void main(String[] args) throws IOException {
		
		
		String bname= browser();
		
		System.out.println(bname);
		
	
		
		

	}

}
