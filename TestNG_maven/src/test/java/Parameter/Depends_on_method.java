package Parameter;

import org.testng.annotations.Test;

public class Depends_on_method {
	
	@Test (dependsOnMethods = "openBrowser")
	public void SignIn() {
		System.out.println("This will execute second(SignIn)");
	}
	@Test
	public void openBrowser() {
		System.out.println("This will execute first(open Browser)");
	}
	
	@Test(dependsOnMethods = "SignIn")
	public void LogOut() {
		System.out.println("The user logged out successfully");
	}
	}
