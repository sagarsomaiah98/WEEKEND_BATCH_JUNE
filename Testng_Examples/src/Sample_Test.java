import org.testng.annotations.Test;

public class Sample_Test {
	
	@Test(priority=2)
	public void SENDMAIL() {
		
		System.out.println("SENDMAIL");
	}
	@Test(priority=3)
	public void LOGOUT() {
		
		System.out.println("LOGOUT OF THE  APPLICATION");
	}
	@Test(priority=1)
	public void login() {
		
		System.out.println("LOGIN TO APPLICATION");
	}

}
