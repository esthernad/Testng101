package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	
	@Test(groups = {"smoke"})
	public void weblogincarHome() {
		System.out.println("webloginHome");
	}
	@Parameters({"URL"})
	@Test 
	public void MobileLoginHome(String uname) {
		System.out.println(uname);
	}
	
	@Test 
	public void LoginApiHome() {
		System.out.println("LoginApiHome");
	}

}
