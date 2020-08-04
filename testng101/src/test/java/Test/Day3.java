package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {

	@Parameters({"URL"})
	@Test 
	public void Websignincarloan(String urlname) {
		System.out.println("Websignincarloan");
		System.out.println(urlname);
	}
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test in day 3 class");
	}
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	
	@Test(groups = {"smoke"}) 
	public void MobileLogincarloan() {
		System.out.println("MobileLogincarloan");
	}
	
	
	@BeforeSuite 
	public void BFSuite() {
		System.out.println("I am no 1");
	}
	
	@Test (dependsOnMethods = {"Websignincarloan"})
	public void ApiLoginApicarloan() {
		System.out.println("ApiLoginApicarloan");
	}
	
	
	
	
	
}
