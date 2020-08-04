package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
	
	@AfterSuite
	public void afsuite() {
		System.out.println("I am the no1 from last");
	}
	
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	

}
